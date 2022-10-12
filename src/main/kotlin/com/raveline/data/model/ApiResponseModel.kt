package com.raveline.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponseModel(
     val success: Boolean,
     val message: String?=null,
     val prevPage: Int? = null,
     val nextPage: Int? = null,
     val heroes: List<HeroModel> = emptyList()
)
