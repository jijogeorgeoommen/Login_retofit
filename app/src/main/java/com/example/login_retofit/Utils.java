package com.example.login_retofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Utils {
    public Apis getApi()
    {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://sicsglobal.co.in/Service_App/API/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Apis apis=retrofit.create(Apis.class);
        return apis;
    }
}
