package com.fluxninja.aperture.sdk;

import com.fluxninja.aperture.flowcontrol.v1.CheckRequest;
import com.fluxninja.aperture.flowcontrol.v1.FlowControlServiceGrpc;
import io.grpc.Metadata;
import io.opentelemetry.api.baggage.Baggage;
import io.opentelemetry.api.trace.Tracer;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Clock;
import java.util.HashMap;
import java.util.Map;

import static com.fluxninja.aperture.sdk.Constants.*;

public final class ApertureSDK {
  private final FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient;
  private final Tracer tracer;
  private final Duration timeout;

  ApertureSDK(
      FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient,
      Tracer tracer,
      Duration timeout) {
    this.flowControlClient = flowControlClient;
    this.tracer = tracer;
    this.timeout = timeout;
  }

  /**
   * Returns a new {@link ApertureSDKBuilder} for configuring an instance of {@linkplain
   * ApertureSDK the Aperture SDK}.
   */
  public static ApertureSDKBuilder builder() {
    return new ApertureSDKBuilder();
  }

  public Flow startFlow(String feature, Map<String, String> explicitLabels) {
    Map<String, String> labels = new HashMap<>();

    for (var entry: Baggage.current().asMap().entrySet()) {
      String value = URLDecoder.decode(entry.getValue().getValue(), StandardCharsets.UTF_8);
      labels.put(entry.getKey(), value);
    }

    labels.putAll(explicitLabels);


    var req = CheckRequest.newBuilder()
            .setFeature(feature)
            .putAllLabels(labels)
            .build();

    var span = this.tracer.spanBuilder("Aperture Check").startSpan()
            .setAttribute(FLOW_START_TIMESTAMP_LABEL, Clock.systemUTC().millis()) // TODO: get nanos
            .setAttribute(SOURCE_LABEL, "sdk");

    var metadata = new Metadata();
    // TODO: get ip from header
    // TODO: check for errors?
    var res = this.flowControlClient.check(req);
//    var ipHeader = res.
    var ip = "192.168.0.1";
//    in aperture-go: tracer.start()
//    var logs = logExporter.export()

    span.setAttribute(CHECK_RESPONSE_TIMESTAMP_LABEL, Clock.systemUTC().millis());

    return new Flow(
            res,
            span,
            ip,
            false
    );
  }
}
