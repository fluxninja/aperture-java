package com.fluxninja.aperture.sdk;

import java.time.Duration;

public final class Constants {
    // Library name and version can be used by the user to create a resource that connects to telemetry expoert.
    public static final String LIBRARY_NAME = "aperture-java";
    public static final String LIBRARY_VERSION = "0.1.0";

    // Config defaults.
    public static final Duration DEFAULT_RPC_TIMEOUT = Duration.ofMillis(200);
    public static final Duration DEFAULT_GRPC_RECONNECTION_TIME = Duration.ofSeconds(10);

    // Label keys.
    public static final String SOURCE_LABEL = "aperture.source";
    public static final String FEATURE_STATUS_LABEL = "aperture.feature_status";
    public static final String FEATURE_IP_LABEL = "aperture.feature_ip";
    public static final String CHECK_RESPONSE_LABEL = "aperture.check_response";
    public static final String FLOW_START_TIMESTAMP_LABEL = "aperture.flow_start_timestamp";
    public static final String FLOW_STOP_TIMESTAMP_LABEL = "aperture.flow_stop_timestamp";
    public static final String CHECK_RESPONSE_TIMESTAMP_LABEL = "aperture.check_response_timestamp";

    private Constants() {}
}