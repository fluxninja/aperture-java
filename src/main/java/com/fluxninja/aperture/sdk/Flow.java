package com.fluxninja.aperture.sdk;

import com.fluxninja.aperture.flowcontrol.v1.CheckResponse;
import io.opentelemetry.sdk.logs.data.LogData;

public final class Flow {
  private final CheckResponse checkResponse;
  private final LogData log;
  private final String clientIP;
  private boolean ended;

  Flow(
    CheckResponse checkResponse,
    LogData log,
    String clientIP,
    boolean ended) {
    this.checkResponse = checkResponse;
    this.log = log;
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

  public void end(FlowStatus statusCode) {
    if (this.ended) {
      // TODO throw error
    }
    this.ended = true;
    // TODO fill log attributes
  }
}
