package com.fluxninja.aperture.armeria;

import com.fluxninja.aperture.sdk.ApertureSDK;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.fluxninja.aperture.sdk.Flow;
import com.fluxninja.aperture.sdk.FlowStatus;
import com.linecorp.armeria.client.ClientRequestContext;
import com.linecorp.armeria.client.HttpClient;
import com.linecorp.armeria.client.SimpleDecoratingHttpClient;
import com.linecorp.armeria.common.HttpRequest;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.HttpStatus;

import java.util.Map;
import java.util.function.Function;

public class ApertureHTTPClient extends SimpleDecoratingHttpClient {
    private final ApertureSDK apertureSDK;

    public static Function<? super HttpClient, ApertureHTTPClient> newDecorator(ApertureSDK apertureSDK) {
        ApertureHTTPClientBuilder builder = new ApertureHTTPClientBuilder();
        builder.setApertureSDK(apertureSDK);
        return builder::build;
    }

    public ApertureHTTPClient(HttpClient delegate, ApertureSDK apertureSDK) {
        super(delegate);
        this.apertureSDK = apertureSDK;
    }

    @Override
    public HttpResponse execute(ClientRequestContext ctx, HttpRequest req) throws Exception {
        Map<String, String> labels = HttpUtils.labelsFromRequest(req);
        Flow flow = this.apertureSDK.startFlow("", labels);

        if (flow.accepted()) {
            HttpResponse res;
            try {
                res = unwrap().execute(ctx, req);
                flow.end(FlowStatus.OK);
            } catch (ApertureSDKException e) {
                // ending flow failed
                e.printStackTrace();
                return HttpResponse.of(HttpStatus.INTERNAL_SERVER_ERROR);
            } catch (Exception e) {
                try {
                    flow.end(FlowStatus.Error);
                } catch (ApertureSDKException ae) {
                    ae.printStackTrace();
                }
                throw e;
            }
            return res;
        } else {
            HttpStatus code = HttpUtils.handleRejectedFlow(flow);
            return HttpResponse.of(code);
        }
    }
}
