package com.raveline.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import javax.naming.AuthenticationException

fun Application.configureStatusPage() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, statusCode ->
            call.respond(
                message = "Not Found",
                status = statusCode
            )
        }
        exception<AuthenticationException> { call: ApplicationCall, e ->
            call.respond(
                message = e.message.toString() + " - Exception caught",
                status = HttpStatusCode.OK
            )
        }
    }
}