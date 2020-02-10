package com.example.moshiparsingdemo.ui.network.api

import com.example.moshiparsingdemo.ui.adapters.NullToEmptyStringAdapter
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object MoshiDemoFactory {

    private val authInterceptor = Interceptor { chain ->
        val newUrl = chain.request().url()
            .newBuilder()
            // in case we want to add a parameter key
            //.addQueryParameter("api_key", AppConstants.key)
            .build()

        val newRequest = chain.request()
            .newBuilder()
            .url(newUrl)
            .build()

        chain.proceed(newRequest)
    }

    //OkhttpClient for building http request url
    private val moshiClient = OkHttpClient().newBuilder()
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .addInterceptor(authInterceptor)
        .build()

    //in case we want tio handle null or missing fields on api responses
    val moshi = Moshi.Builder().add(NullToEmptyStringAdapter())
        .add(KotlinJsonAdapterFactory())
        .build()

    fun retrofit(): Retrofit = Retrofit.Builder()
        .client(moshiClient)
        .baseUrl("http://www.mocky.io/v2/")
        .addConverterFactory(MoshiConverterFactory.create(moshi).asLenient())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()


    val moshiApi: MoshiApi = retrofit().create(MoshiApi::class.java)

}