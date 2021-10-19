package com.course.networking.network

import com.course.networking.model.ResponseServer
import retrofit2.Call
import retrofit2.http.GET

interface NetworkService {

    @GET("api?action=findAll")
    fun getDataAPI():Call<ResponseServer>
}