package com.raveline.plugins

import com.raveline.routes.getAllHeroes
import com.raveline.routes.root
import com.raveline.routes.searchHeroes
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import javax.naming.AuthenticationException

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        searchHeroes()
        static("/images"){
            resources("images")
        }
    }
}
