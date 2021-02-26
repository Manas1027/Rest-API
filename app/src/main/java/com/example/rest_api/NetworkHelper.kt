package com.example.restapi

import android.telecom.Call
import com.example.rest_api.model.SchoolClass
import com.example.restapi.retrofit.ApiInterface
import retrofit2.Response
import retrofit2.Retrofit
import javax.security.auth.callback.Callback

class NetworkHelper(private val apiClient: Retrofit) {

    fun getClasses(listener: NetworkListener){
        val call: Call<List<SchoolClass>> = apiClient.create(ApiInterface::class.java).getClasses()
        call.enqueue(object: Callback<List<SchoolClass>> {
            override fun onResponse(
                    call: Call<List<SchoolClass>>?,
                    response: Response<List<SchoolClass>>?
            ) {
                listener.onSchollClassesResponse(response?.body())
            }

            override fun onFailure(call: Call<List<SchoolClass>>?, t: Throwable?) {
                listener.onSchollClassesFailure(t?.localizedMessage)
            }

        })
    }

}