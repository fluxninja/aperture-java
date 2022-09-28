package com.fluxninja.aperture.sdk;

import com.fluxninja.aperture.flowcontrol.v1.FlowControlServiceGrpc;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogExporter;

import java.time.Duration;
import java.util.Map;

public final class ApertureSDK {
  private final FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient;
  private final OtlpGrpcLogExporter logExporter;
  private final Duration timeout;

  ApertureSDK(
      FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient,
      OtlpGrpcLogExporter logExporter,
      Duration timeout) {
    this.flowControlClient = flowControlClient;
    this.logExporter = logExporter;
    this.timeout = timeout;
  }

  /**
   * Returns a new {@link ApertureSDKBuilder} for configuring an instance of {@linkplain
   * ApertureSDK the Aperture SDK}.
   */
  public static ApertureSDKBuilder builder() {
    return new ApertureSDKBuilder();
  }

  public Flow startFlow(String feature, Map<String, String> labels) {
    // TODO implement
    return null;
  }
}
