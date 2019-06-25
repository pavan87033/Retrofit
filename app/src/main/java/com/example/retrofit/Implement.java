package com.example.retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Implement {
    private static final String key = "company no";
    private static final String url = "http://navjacinth9.000webhostapp.com/json/retrofit-demo.php";

    private Retrofit mRetrofit = null;
public static PostService getService()
{

        if(PostService == null){
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }

}