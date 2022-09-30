package com.fluxninja.aperture.sdk;

import com.fluxninja.aperture.flowcontrol.v1.CheckResponse;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.sdk.logs.data.LogData;

import java.time.Clock;

import static com.fluxninja.aperture.sdk.Constants.*;

public final class Flow {
  private final CheckResponse checkResponse;
  private final Span span;
  private final String clientIP;
  private boolean ended;

  Flow(
    CheckResponse checkResponse,
    Span span,
    String clientIP,
    boolean ended) {
    this.checkResponse = checkResponse;
    this.span = span;
    this.clientIP = clientIP;
    this.ended = ended;
  }

  public boolean accepted() {
    if (this.checkResponse == null) {
      return true;
    }
    return this.checkResponse.getDecisionType() == CheckResponse.DecisionType.DECISION_TYPE_ACCEPTED;
  }

  public CheckResponse checkResponse() {
    return this.checkResponse;
  }

  public void end(FlowStatus statusCode) throws ApertureSDKException {
    if (this.ended) {
      throw new ApertureSDKException("Flow already ended");
    }
    this.ended = true;

    // TODO: check result and use .toByteArray() or .toByteString() if wrong
    String checkResponseJSONBytes = this.checkResponse.toString();

    this.span.setAttribute(FEATURE_STATUS_LABEL, statusCode.name())
            .setAttribute(FEATURE_IP_LABEL, this.clientIP)
            .setAttribute(CHECK_RESPONSE_LABEL, checkResponseJSONBytes)
            .setAttribute(FLOW_STOP_TIMESTAMP_LABEL, Clock.systemUTC().millis());

    this.span.end();
  }
}
