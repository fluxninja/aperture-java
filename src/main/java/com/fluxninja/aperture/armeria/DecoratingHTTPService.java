package com.fluxninja.aperture.armeria;

import com.fluxninja.aperture.sdk.ApertureSDK;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.fluxninja.aperture.sdk.Flow;
import com.fluxninja.aperture.sdk.FlowStatus;
import com.linecorp.armeria.common.HttpRequest;
import com.linecorp.armeria.common.HttpResponse;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.server.HttpService;
import com.linecorp.armeria.server.ServiceRequestContext;
import com.linecorp.armeria.server.SimpleDecoratingHttpService;

import java.util.HashMap;
import java.util.Map;

public class DecoratingHTTPService extends SimpleDecoratingHttpService {
    private ApertureSDK apertureSDK;
    private String featureName;

    public DecoratingHTTPService(HttpService delegate, ApertureSDK apertureSDK, String featureName) {
        super(delegate);
        try {
            this.apertureSDK = apertureSDK;
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

    // TODO: extract it into some common utils file
    // TODO: some header keys have colons, handle that (e.g. http.request.header.:method should probably not be produced)
    private Map<String, String> labelsFromRequest(HttpRequest req) {
        Map<String, String> labels = new HashMap<>();
        var headers = req.headers();
        for (var header: headers) {
            String labelName = String.format("http.request.header.%s", header.getKey());
            labels.put(labelName, header.getValue());
        }
        labels.put("http.method", req.method().toString());
        labels.put("http.uri", req.uri().toString());
        return labels;
    }
}
