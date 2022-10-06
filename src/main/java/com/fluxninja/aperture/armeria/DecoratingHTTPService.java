package com.fluxninja.aperture.armeria;

import com.fluxninja.aperture.sdk.*;
import com.linecorp.armeria.common.HttpRequest;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.server.HttpService;
import com.linecorp.armeria.server.ServiceRequestContext;
import com.linecorp.armeria.server.SimpleDecoratingHttpService;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DecoratingHTTPService extends SimpleDecoratingHttpService {
    private ApertureSDK apertureSDK;
    private String featureName;

    public DecoratingHTTPService(HttpService delegate, String agentHost, int agentPort, Duration timeout, String featureName) {
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
    public HttpResponse serve(ServiceRequestContext ctx, HttpRequest req) {
        Map<String, String> labels = labelsFromRequest(req);
        Flow flow = this.apertureSDK.startFlow(featureName, labels);

        if (flow.accepted()) {
            HttpResponse res;
            try {
                res = unwrap().serve(ctx, req);
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
