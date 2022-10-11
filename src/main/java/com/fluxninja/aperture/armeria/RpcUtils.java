package com.fluxninja.aperture.armeria;

import com.fluxninja.aperture.flowcontrol.v1.CheckResponse;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.fluxninja.aperture.sdk.Flow;
import com.fluxninja.aperture.sdk.FlowStatus;
import com.linecorp.armeria.common.HttpStatus;
import com.linecorp.armeria.common.RpcRequest;

import java.util.HashMap;
import java.util.Map;

class RpcUtils {
    protected static HttpStatus handleRejectedFlow(Flow flow) {
        CheckResponse.RejectReason reason = flow.checkResponse().getRejectReason();
        try {
            flow.end(FlowStatus.Error);
        } catch (ApertureSDKException e) {
            e.printStackTrace();
        }
        // TODO: investigate what can be returned in rpcResponse instead of http code
        return switch (reason) {
            case REJECT_REASON_RATE_LIMITED -> HttpStatus.TOO_MANY_REQUESTS;
            case REJECT_REASON_CONCURRENCY_LIMITED -> HttpStatus.SERVICE_UNAVAILABLE;
            default -> HttpStatus.BAD_REQUEST;
        };
    }

    // TODO: Make it compatible with envoy authz
    protected static Map<String, String> labelsFromRequest(RpcRequest req) {
        Map<String, String> labels = new HashMap<>();
        labels.put("rpc.method", req.method());
        return labels;
    }
}
