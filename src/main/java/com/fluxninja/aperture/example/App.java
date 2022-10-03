package com.fluxninja.aperture.example;

import com.fluxninja.aperture.sdk.ApertureSDK;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.fluxninja.aperture.sdk.Flow;
import com.fluxninja.aperture.sdk.FlowStatus;
import spark.Spark;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class App {
    final private ApertureSDK apertureSDK;
    public App(
            ApertureSDK apertureSDK
    ){
        this.apertureSDK = apertureSDK;
    }

    public static void main(String[] args) {
        final String agentHost = "aperture-agent.aperture-agent.svc.cluster.local";
        final int agentPort = 8089;

        ApertureSDK apertureSDK;
        try {
            apertureSDK = ApertureSDK.builder()
                    .setHost(agentHost)
                    .setPort(agentPort)
                    .setDuration(Duration.ofMillis(1000))
                    .build();
        } catch (ApertureSDKException e) {
            e.printStackTrace();
            return;
        }

        App app = new App(apertureSDK);
        Spark.get("/super", app::handleSuperAPI);
    }

    private String handleSuperAPI(spark.Request req, spark.Response res) {
        Map<String, String> labels = new HashMap<>();

        // do some business logic to collect labels
        labels.put("user", "kenobi");

        // StartFlow performs a flowcontrolv1.Check call to Aperture Agent. It returns a Flow.
        Flow flow = this.apertureSDK.startFlow("awesomeFeature", labels);

        // See whether flow was accepted by Aperture Agent.
        if (flow.accepted()) {
            // Simulate work being done
            try {
                Thread.sleep(5000);
                // Need to call end() on the Flow in order to provide telemetry to Aperture Agent for completing the control loop.
                // The first argument captures whether the feature captured by the Flow was successful or resulted in an error.
                // The second argument is error message for further diagnosis.
                flow.end(FlowStatus.OK);
            } catch (InterruptedException | ApertureSDKException e) {
                e.printStackTrace();
            }
        } else {
            // Flow has been rejected by Aperture Agent.
            try {
                flow.end(FlowStatus.Error);
            } catch (ApertureSDKException e) {
                e.printStackTrace();
            }
        }
        return "Hello world";
    }
}
