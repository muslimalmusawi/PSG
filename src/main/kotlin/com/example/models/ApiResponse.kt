package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val newtPage: Int? = null,
    val heroes: List<Hero> = emptyList()
)
