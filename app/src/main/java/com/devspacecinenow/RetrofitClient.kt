package com.devspacecinenow

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val retrofitInstance: Retrofit = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}