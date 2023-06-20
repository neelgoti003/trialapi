package com.example.trialapi;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static RetrofitInstance instance = null;
    private ApiInterface myApi;

    private RetrofitInstance() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL )
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(ApiInterface.class);
    }

    public static synchronized RetrofitInstance getInstance() {
        if (instance == null) {
            instance = new RetrofitInstance();
        }
        return instance;
    }

    public ApiInterface getMyApi() {
        return myApi;
    }
}
