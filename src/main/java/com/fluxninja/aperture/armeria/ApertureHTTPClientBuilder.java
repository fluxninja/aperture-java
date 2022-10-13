package com.fluxninja.aperture.armeria;

import com.fluxninja.aperture.sdk.ApertureSDK;
import com.linecorp.armeria.client.HttpClient;

public class ApertureHTTPClientBuilder {
    ApertureSDK apertureSDK;
    public ApertureHTTPClientBuilder setApertureSDK(ApertureSDK apertureSDK) {
        this.apertureSDK = apertureSDK;
        return this;
    }

    public ApertureHTTPClient build(HttpClient delegate) {
        return new ApertureHTTPClient(delegate, apertureSDK);
    }
}
