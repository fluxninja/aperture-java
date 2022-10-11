package com.fluxninja.aperture.armeria;

import com.fluxninja.aperture.flowcontrol.v1.CheckResponse;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.fluxninja.aperture.sdk.Flow;
import com.fluxninja.aperture.sdk.FlowStatus;
import com.linecorp.armeria.common.HttpRequest;
import com.linecorp.armeria.common.HttpStatus;

import java.util.HashMap;
import java.util.Map;

class HttpUtils {
    protected static HttpStatus handleRejectedFlow(Flow flow) {
        CheckResponse.RejectReason reason = flow.checkResponse().getRejectReason();
        try {
            flow.end(FlowStatus.Error);
        } catch (ApertureSDKException e) {
            e.printStackTrace();
        }
        return switch (reason) {
            case REJECT_REASON_RATE_LIMITED -> HttpStatus.TOO_MANY_REQUESTS;
            case REJECT_REASON_CONCURRENCY_LIMITED -> HttpStatus.SERVICE_UNAVAILABLE;
            default -> HttpStatus.BAD_REQUEST;
        };
    }

    // TODO: Make it compatible with envoy authz
    protected static Map<String, String> labelsFromRequest(HttpRequest req) {
        Map<String, String> labels = new HashMap<>();
        var headers = req.headers();
        for (var header: headers) {
            String headerKey = header.getKey().toString();
            if (headerKey.startsWith(":")) {
                continue;
            }
            String labelName = String.format("http.request.header.%s", headerKey);
            labels.put(labelName, header.getValue());
        }
        labels.put("http.method", req.method().toString());
        labels.put("http.uri", req.uri().toString());
        return labels;
    }
}
