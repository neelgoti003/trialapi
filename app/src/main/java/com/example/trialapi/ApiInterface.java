package com.example.trialapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
        String BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/";
        @GET("test")
        Call<List<RespModel>> getsuperHeroes();

}
