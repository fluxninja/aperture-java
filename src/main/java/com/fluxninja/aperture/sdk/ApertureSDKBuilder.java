package com.fluxninja.aperture.sdk;

import com.fluxninja.aperture.flowcontrol.v1.FlowControlServiceGrpc;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogExporter;

import java.time.Duration;

/** A builder for configuring an {@link ApertureSDK}. */
public final class ApertureSDKBuilder {

  private FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient;
  private OtlpGrpcLogExporter logExporter;
  private Duration timeout;

  ApertureSDKBuilder() {}

  public ApertureSDKBuilder setFlowControlClient(FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient) {
    this.flowControlClient = flowControlClient;
    return this;
  }

  public ApertureSDKBuilder setLogger(OtlpGrpcLogExporter logExporter) {
    this.logExporter = logExporter;
    return this;
  }

  public ApertureSDKBuilder setDuration(Duration timeout) {
    this.timeout = timeout;
    return this;
  }

  public ApertureSDK build() {
    FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient = this.flowControlClient;
    if (flowControlClient == null) {
      // TODO handle
    }

    OtlpGrpcLogExporter logExporter = this.logExporter;
    if (logExporter == null) {
      // TODO handle
    }

    Duration timeout = this.timeout;
    if (timeout == null) {
      // TODO handle
    }

    return new ApertureSDK(
            flowControlClient,
            logExporter,
            timeout);
  }
}
