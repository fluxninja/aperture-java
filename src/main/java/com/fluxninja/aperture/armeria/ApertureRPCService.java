package com.fluxninja.aperture.armeria;

import com.fluxninja.aperture.sdk.ApertureSDK;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.fluxninja.aperture.sdk.Flow;
import com.fluxninja.aperture.sdk.FlowStatus;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.common.RpcRequest;
import com.linecorp.armeria.common.RpcResponse;
import com.linecorp.armeria.server.RpcService;
import com.linecorp.armeria.server.ServiceRequestContext;
import com.linecorp.armeria.server.SimpleDecoratingRpcService;

import java.util.Map;

public class ApertureRPCService extends SimpleDecoratingRpcService {
    private final ApertureSDK apertureSDK;

    public ApertureRPCService(RpcService delegate, ApertureSDK apertureSDK) {
        super(delegate);
        this.apertureSDK = apertureSDK;
    }

    @Override
    public RpcResponse serve(ServiceRequestContext ctx, RpcRequest req) {
        Map<String, String> labels = RpcUtils.labelsFromRequest(req);
        Flow flow = this.apertureSDK.startFlow("", labels);

        if (flow.accepted()) {
            RpcResponse res;
            try {
                res = unwrap().serve(ctx, req);
                flow.end(FlowStatus.OK);
            } catch (ApertureSDKException e) {
                // ending flow failed
                e.printStackTrace();
                return RpcResponse.of(HttpStatus.BAD_REQUEST);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return res;
        } else {
            HttpStatus code = RpcUtils.handleRejectedFlow(flow);
            return RpcResponse.of(code);
        }
    }
}
