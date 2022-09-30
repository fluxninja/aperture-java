package com.fluxninja.aperture.example;

import com.fluxninja.aperture.flowcontrol.v1.FlowControlServiceGrpc;
import com.fluxninja.aperture.sdk.ApertureSDK;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.fluxninja.aperture.sdk.FlowStatus;
import io.grpc.ManagedChannelBuilder;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;

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
        final var agentHost = "aperture-agent.aperture-system.svc.cluster.local";

        var channel = ManagedChannelBuilder.forAddress(agentHost, 8080).build();
        var flowControlClient = FlowControlServiceGrpc.newBlockingStub(channel);

        var endpoint = String.format("http://%s:8080", agentHost);
        // TODO: set more options to exporter if necessary
        var spanExporter = OtlpGrpcSpanExporter.builder()
                .setEndpoint(endpoint)
                .build();

        var apertureSDK = ApertureSDK.builder()
                .setDuration(Duration.ofMillis(200))
                .setSpanExporter(spanExporter)
                .setFlowControlClient(flowControlClient)
                .build();

        App app = new App(apertureSDK);
        Spark.get("/super", app::handleSuperAPI);
    }

    private String handleSuperAPI(spark.Request req, spark.Response res) {
        Map<String, String> labels = new HashMap<>();

        // do some business logic to collect labels
        labels.put("user", "kenobi");

        // StartFlow performs a flowcontrolv1.Check call to Aperture Agent. It returns a Flow.
        var flow = this.apertureSDK.startFlow("awesomeFeature", labels);

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
