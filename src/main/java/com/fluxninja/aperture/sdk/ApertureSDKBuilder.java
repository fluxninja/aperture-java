package com.fluxninja.aperture.sdk;

import com.fluxninja.aperture.flowcontrol.v1.FlowControlServiceGrpc;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.exporter.logging.LoggingSpanExporter;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.SdkTracerProvider;

import java.time.Duration;

import static com.fluxninja.aperture.sdk.Constants.LIBRARY_NAME;

/** A builder for configuring an {@link ApertureSDK}. */
public final class ApertureSDKBuilder {

  private FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient;
  private OtlpGrpcSpanExporter spanExporter;
  private Duration timeout;

  ApertureSDKBuilder() {}

  public ApertureSDKBuilder setFlowControlClient(FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient) {
    this.flowControlClient = flowControlClient;
    return this;
  }

  public ApertureSDKBuilder setSpanExporter(OtlpGrpcSpanExporter spanExporter) {
    this.spanExporter = spanExporter;
    return this;
  }

  public ApertureSDKBuilder setDuration(Duration timeout) {
    this.timeout = timeout;
    return this;
  }

  // CONSTRUCT FROM GRPC CLIENT CONN and timeout duration
  public ApertureSDK build() {
    FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient = this.flowControlClient;
    if (flowControlClient == null) {
      // TODO handle
    }

    OtlpGrpcSpanExporter spanExporter = this.spanExporter;
    if (spanExporter == null) {
      // TODO handle
    }

    var traceProvider = SdkTracerProvider.builder()
            .addSpanProcessor(SimpleSpanProcessor.create(spanExporter))
            .build();
    var tracer = traceProvider.tracerBuilder(LIBRARY_NAME).build();

    Duration timeout = this.timeout;
    if (timeout == null) {
      // TODO handle
    }

    return new ApertureSDK(
            flowControlClient,
            tracer,
            timeout);
  }
}
