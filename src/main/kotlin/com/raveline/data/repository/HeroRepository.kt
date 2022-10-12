package com.raveline.data.repository

import com.raveline.data.model.ApiResponseModel
import com.raveline.data.model.HeroModel

 interface HeroRepository {

    val heroes: Map<Int,List<HeroModel>>

    val page1: List<HeroModel>
    val page2: List<HeroModel>
    val page3: List<HeroModel>
    val page4: List<HeroModel>
    val page5: List<HeroModel>

    suspend fun getAllHeroes(page: Int = 1): ApiResponseModel
    suspend fun searchHeroes(heroName: String?): ApiResponseModel
}
