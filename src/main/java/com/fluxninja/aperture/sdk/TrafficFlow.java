package com.fluxninja.aperture.sdk;

import com.fluxninja.generated.envoy.service.auth.v3.CheckResponse;
import com.google.protobuf.Value;
import com.google.protobuf.util.JsonFormat;
import com.google.rpc.Code;
import io.opentelemetry.api.trace.Span;

import static com.fluxninja.aperture.sdk.Constants.*;

public class TrafficFlow {
    private final CheckResponse checkResponse;
    private final Span span;
    private boolean ended;

    TrafficFlow(
            CheckResponse checkResponse,
            Span span,
            boolean ended) {
        this.checkResponse = checkResponse;
        this.span = span;
        this.ended = ended;
    }

    public boolean accepted() {
        return this.checkResponse.getStatus().getCode() == Code.OK_VALUE;
    }

    public CheckResponse checkResponse() {
        return this.checkResponse;
    }

    public void end(FlowStatus statusCode) throws ApertureSDKException {
        if (this.ended) {
            throw new ApertureSDKException("Flow already ended");
        }
        this.ended = true;

        String checkResponseJSONBytes = "";
        if (this.checkResponse.hasDynamicMetadata()
                && this.checkResponse.getDynamicMetadata().getFieldsMap().containsKey("aperture.check_response")) {
            Value featureResponse = this.checkResponse.getDynamicMetadata().getFieldsMap().get("aperture.check_response");
            try {
                checkResponseJSONBytes = JsonFormat.printer().print(featureResponse);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw new ApertureSDKException(e);
            }
        }

        this.span.setAttribute(FEATURE_STATUS_LABEL, statusCode.name())
                .setAttribute(CHECK_RESPONSE_LABEL, checkResponseJSONBytes)
                .setAttribute(FLOW_STOP_TIMESTAMP_LABEL, Utils.getCurrentEpochNanos());

        this.span.end();
    }
}
