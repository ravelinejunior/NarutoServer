package com.raveline.routes

import com.raveline.data.model.ApiResponseModel
import com.raveline.data.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHeroes(){
    val heroesRepository:HeroRepository by inject()
    get("/naruto/heroes"){
        try{
            val page = call.request.queryParameters["page"]?.toInt()?:1
            require(page in 1..5)
            println("NEW PAGE: $page")
            val response = heroesRepository.getAllHeroes(page)


            call.respond(message = response,
            status = HttpStatusCode.OK)
        }catch (e:NumberFormatException){
            call.respond(
                message = ApiResponseModel(success = false,message = "Only Numbers Allowed"),
                status = HttpStatusCode.BadRequest
            )
        }catch (e:IllegalArgumentException){
            call.respond(
                message = ApiResponseModel(success = false,message = "Heroes not found"),
                status = HttpStatusCode.BadRequest
            )
        }
    }
}