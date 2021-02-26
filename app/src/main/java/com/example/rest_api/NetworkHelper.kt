package com.example.rest_api

import com.example.rest_api.model.SchoolClass
import com.example.restapi.retrofit.ApiInterface
import retrofit2.Response
import retrofit2.Retrofit

class NetworkHelper(private val apiClient: Retrofit) {

    fun getClasses(listener: NetworkListener){
        val call : retrofit2.Call<List<SchoolClass>> = apiClient.create(ApiInterface::class.java).getClasses()
        call.enqueue(object : retrofit2.Callback<List<SchoolClass>> {
            override fun onFailure(call: retrofit2.Call<List<SchoolClass>>?, t: Throwable?) {
                listener.onSchoolClassesFailure(t?.localizedMessage)
            }

            override fun onResponse(
                call: retrofit2.Call<List<SchoolClass>>?,
                response: Response<List<SchoolClass>>?
            ) {
                listener.onSchoolClassesResponse(response?.body())
            }

        })
    }

}