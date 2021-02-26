package com.example.restapi.retrofit

import com.example.restapi.model.SchoolClass
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/class")
    fun getClasses(): Call<List<SchoolClass>>
}