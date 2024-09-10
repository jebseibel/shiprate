package com.shiprate.datafeed.fedex.api;

import okhttp3.*;

public class Input {

    public Input() {

    }

    public Response getResponse() {
        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/json");


        // 'input' refers to JSON Payload
        RequestBody body = RequestBody.create(mediaType, input);
        Request request = new Request.Builder()
                .url("https://apis-sandbox.fedex.com/oauth/token")
                .post(body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        Response response = client.newCall(request).execute();
    }
}
