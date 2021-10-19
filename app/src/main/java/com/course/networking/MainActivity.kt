package com.course.networking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.course.networking.model.ResponseServer
import com.course.networking.network.ConfigNetwork
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConfigNetwork.getRetrofit().getDataAPI().enqueue(object : Callback<ResponseServer>{
            override fun onFailure(call: Call<ResponseServer>, t: Throwable) {
                Log.d("error server ", t.message.toString())
            }

            override fun onResponse(
                call: Call<ResponseServer>,
                response: Response<ResponseServer>
            ) {
                Log.d("response server ", response.message())
            }
        })

    }
}