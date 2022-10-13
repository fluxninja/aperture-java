package com.fluxninja.aperture.example;

import com.fluxninja.aperture.armeria.ApertureHTTPClient;
import com.fluxninja.aperture.sdk.ApertureSDK;
import com.fluxninja.aperture.sdk.ApertureSDKException;
import com.linecorp.armeria.client.Clients;
import com.linecorp.armeria.client.WebClient;

import java.time.Duration;

public class ArmeriaClient {
    public static void main(String[] args) {
        final String agentHost = "localhost";
        final int agentPort = 8089;

        ApertureSDK apertureSDK;
        try {
            apertureSDK = ApertureSDK.builder()
                    .setHost(agentHost)
                    .setPort(agentPort)
                    .setDuration(Duration.ofMillis(1000))
                    .build();
        } catch (ApertureSDKException e) {
            e.printStackTrace();
            return;
        }

        var client = Clients.builder("http://localhost:10101")
                .decorator(ApertureHTTPClient.newDecorator(apertureSDK))
                .build(WebClient.class);

        var res = client.get("http/base");
        System.out.println(res);
    }

}