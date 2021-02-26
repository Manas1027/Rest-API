package com.example.rest_api.retrofit

import com.example.rest_api.model.SchoolClass
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/blogEntry.comments?blogEntryId=79")
    fun getClasses(): Call<SchoolClass>
}