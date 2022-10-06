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
import com.linecorp.armeria.server.HttpService;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DecoratingHTTPClient extends SimpleDecoratingHttpClient {
    private ApertureSDK apertureSDK;
    private String featureName;

    public DecoratingHTTPClient(HttpClient delegate, String agentHost, int agentPort, Duration timeout, String featureName) {
        super(delegate);
        try {
            this.apertureSDK = ApertureSDK
                    .builder()
                    .setHost(agentHost)
                    .setPort(agentPort)
                    .setDuration(timeout)
                    .build();
            this.featureName = featureName;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public HttpResponse execute(ClientRequestContext ctx, HttpRequest req) throws Exception {
        Map<String, String> labels = labelsFromRequest(req);
        Flow flow = this.apertureSDK.startFlow(featureName, labels);

        if (flow.accepted()) {
            HttpResponse res;
            try {
                res = unwrap().execute(ctx, req);
                flow.end(FlowStatus.OK);
            } catch (InterruptedException | ApertureSDKException e) {
                e.printStackTrace();
                return HttpResponse.of(HttpStatus.BAD_REQUEST);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return res;
        } else {
            try {
                flow.end(FlowStatus.Error);
            } catch (ApertureSDKException e) {
                e.printStackTrace();
            }
            return HttpResponse.of(HttpStatus.BAD_REQUEST);
        }
    }

    private Map<String, String> labelsFromRequest(HttpRequest req) {
        Map<String, String> labels = new HashMap<>();
        // TODO
        labels.put("user", "kenobi");
        return labels;
    }
}
