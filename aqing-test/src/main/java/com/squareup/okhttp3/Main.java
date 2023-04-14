package com.squareup.okhttp3;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttpClient httpClient = builder.build();
        Request request = new Request.Builder().url("http://www.baidu.com").build();
        Call call = httpClient.newCall(request);
        try {
            Response response = call.execute();
            System.out.println(response.message());
        } catch (IOException e) {
            System.err.println("error" + e.getMessage());
        }
    }
}