package com.fluxninja.aperture.armeria;

import com.fluxninja.aperture.sdk.ApertureSDK;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.fluxninja.aperture.sdk.Flow;
import com.fluxninja.aperture.sdk.FlowStatus;
import com.linecorp.armeria.common.*;
import com.linecorp.armeria.server.RpcService;
import com.linecorp.armeria.server.ServiceRequestContext;
import com.linecorp.armeria.server.SimpleDecoratingRpcService;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class DecoratingRPCService extends SimpleDecoratingRpcService {
    private ApertureSDK apertureSDK;
    private String featureName;

    public DecoratingRPCService(RpcService delegate, String agentHost, int agentPort, Duration timeout, String featureName) {
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
    public RpcResponse serve(ServiceRequestContext ctx, RpcRequest req) {
        Map<String, String> labels = labelsFromRequest(req);
        Flow flow = this.apertureSDK.startFlow(featureName, labels);

        if (flow.accepted()) {
            RpcResponse res;
            try {
                res = unwrap().serve(ctx, req);
                flow.end(FlowStatus.OK);
            } catch (InterruptedException | ApertureSDKException e) {
                e.printStackTrace();
                return RpcResponse.of(HttpStatus.BAD_REQUEST);
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
            return RpcResponse.of(HttpStatus.BAD_REQUEST);
        }
    }

    private Map<String, String> labelsFromRequest(RpcRequest req) {
        Map<String, String> labels = new HashMap<>();
        // TODO
        labels.put("user", "kenobi");
        return labels;
    }
}
