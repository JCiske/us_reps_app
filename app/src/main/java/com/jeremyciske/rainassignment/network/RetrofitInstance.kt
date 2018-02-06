package com.jeremyciske.rainassignment.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private const val BASE_URL = "http://whoismyrepresentative.com/"

    fun getRetrofitInstance(): Retrofit {
        val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        return retrofit
    }
}
