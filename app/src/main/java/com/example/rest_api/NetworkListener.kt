package com.example.restapi

import com.example.rest_api.model.SchoolClass

interface NetworkListener {
    fun onSchollClassesResponse(models: List<SchoolClass>?)
    fun onSchollClassesFailure(message: String?)
}