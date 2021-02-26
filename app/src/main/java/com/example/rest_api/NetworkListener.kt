package com.example.restapi

import com.example.restapi.model.SchoolClass

interface NetworkListener {
    fun onSchollClassesResponse(models: List<SchoolClass>?)
    fun onSchollClassesFailure(message: String?)
}