package com.fluxninja.aperture.sdk;

import com.fluxninja.aperture.flowcontrol.v1.FlowControlServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;

import java.time.Duration;

import static com.fluxninja.aperture.sdk.Constants.DEFAULT_RPC_TIMEOUT;
import static com.fluxninja.aperture.sdk.Constants.LIBRARY_NAME;

/** A builder for configuring an {@link ApertureSDK}. */
public final class ApertureSDKBuilder {
  private Duration timeout;
  private String host;
  private int port;
  private boolean useHttps = false;

  ApertureSDKBuilder() {}

  public ApertureSDKBuilder setHost(String host) {
    this.host = host;
    return this;
  }

  public ApertureSDKBuilder setPort(int port) {
    this.port = port;
    return this;
  }

  public ApertureSDKBuilder setDuration(Duration timeout) {
    this.timeout = timeout;
    return this;
  }

  public ApertureSDKBuilder useHttps() {
    this.useHttps = true;
    return this;
  }

  public ApertureSDK build() throws ApertureSDKException {
    String host = this.host;
    if (host == null) {
      throw new ApertureSDKException("host needs to be set");
    }

    int port = this.port;
    if (port == 0) {
      throw new ApertureSDKException("port needs to be set");
    }

    String protocol = "http";
    if(this.useHttps) {
      protocol = "https";
    }

    String endpoint = String.format("%s://%s:%d/v1/trace", protocol, host, port);

    Duration timeout = this.timeout;
    if (timeout == null) {
      timeout = DEFAULT_RPC_TIMEOUT;
    }


    ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
    FlowControlServiceGrpc.FlowControlServiceBlockingStub flowControlClient = FlowControlServiceGrpc.newBlockingStub(channel);

    // TODO: set more options to exporter if necessary
    OtlpGrpcSpanExporter spanExporter = OtlpGrpcSpanExporter.builder()
            .setEndpoint(endpoint)
            .build();
    SdkTracerProvider traceProvider = SdkTracerProvider.builder()
            .addSpanProcessor(SimpleSpanProcessor.create(spanExporter))
            .build();
    Tracer tracer = traceProvider.tracerBuilder(LIBRARY_NAME).build();

    return new ApertureSDK(
            flowControlClient,
            tracer,
            timeout);
  }
}
