package com.bi183.refta.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static final String BASE_URL = "https://uas-ancroid.000webhostapp.com/api-barang/api/"; // link api untuk barang
    public static final String IMAGE_URL = "https://uas-ancroid.000webhostapp.com/api-barang/images/"; // link img untuk barang

    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            try {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            } catch (Exception er) {
                er.printStackTrace();
            }
        }
        return retrofit;
    }
}