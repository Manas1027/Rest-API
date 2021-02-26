package com.example.rest_api.model

data class Rezultat(
        var id: Int,
        var creationTimeSeconds: Int,
        var commentatorHandle: String,
        var locale: String,
        var text: String,
        var rating: Int
)