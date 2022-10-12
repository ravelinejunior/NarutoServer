package com.raveline.data.model

import kotlinx.serialization.Serializable

@Serializable
data class HeroModel(
     val id: Int,
     val heroName: String,
     val heroImage: String,
     val heroAbout: String,
     val heroRating: Double,
     val heroPower: Int,
     val month: String,
     val day: String,
     val heroFamily: List<String>,
     val heroAbilities: List<String>,
     val heroNatureTypes: List<String>
    )
