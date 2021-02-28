package com.example.rest_api.retrofit

import com.example.rest_api.model.SchoolClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/api/blogEntry.comments")
    fun getClasses(@Query("blogEntryId") id: Int): Call<SchoolClass>
}