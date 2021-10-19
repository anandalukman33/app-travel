package com.course.networking.network

import android.net.Network
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ConfigNetwork {

    companion object {
    fun getRetrofit() : NetworkService {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://udacoding.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(NetworkService::class.java)
        return service
    }
  }
}