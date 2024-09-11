package com.trax.shiprate.carriers.ups.api;

import com.trax.shiprate.config.UpsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.*;
import java.net.http.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Component
public class ClientApp {

    @Autowired
    UpsConfig upsConfig;

    public HttpResponse<String> getToken() throws IOException, InterruptedException {

        String clientId = upsConfig.getClientId();
        String secretId = upsConfig.getSecretId();
        String clientAndSecret = clientId + ":" + secretId;

        HttpClient httpClient = HttpClient.newBuilder().build();

        HashMap<String, String> params = new HashMap<>();
        params.put("grant_type", "client_credentials");

        String form = params.keySet().stream()
                .map(key -> key + "=" + URLEncoder.encode(params.get(key), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&"));

        String host = "https://wwwcie.ups.com";
        String pathname = "/security/v1/oauth/token";
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(form))
                .uri(URI.create(host + pathname ))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("x-merchant-id", "string")
                .header("Authorization", "Basic " + Base64.getEncoder().encodeToString((clientAndSecret).getBytes()))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        return response;
    }
}