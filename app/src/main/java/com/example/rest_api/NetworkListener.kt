package com.example.rest_api

import com.example.rest_api.model.Rezultat

interface NetworkListener {
    fun onSchoolClassesResponse(models: List<Rezultat>?)
    fun onSchoolClassesFailure(message: String?)
}