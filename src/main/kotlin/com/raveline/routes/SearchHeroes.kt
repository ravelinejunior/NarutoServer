package com.raveline.routes

import com.raveline.data.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {

    val heroRepository: HeroRepository by inject()

    get("/naruto/heroes/search") {
        val name = call.request.queryParameters["heroName"]

        val response = heroRepository.searchHeroes(name)

        call.respond(
            message = response,
            status = HttpStatusCode.OK
        )

    }

}