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
    private final ApertureSDK apertureSDK;
    private final String featureName;

    public DecoratingRPCService(RpcService delegate, ApertureSDK apertureSDK, String featureName) {
        super(delegate);
        this.apertureSDK = apertureSDK;
        this.featureName = featureName;
    }

    @Override
    public RpcResponse serve(ServiceRequestContext ctx, RpcRequest req) {
        Map<String, String> labels = null;
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
}
