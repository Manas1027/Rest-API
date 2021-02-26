package com.example.rest_api

import com.example.rest_api.model.SchoolClass

interface NetworkListener {
    fun onSchoolClassesResponse(models: List<SchoolClass>?)
    fun onSchoolClassesFailure(message: String?)
}