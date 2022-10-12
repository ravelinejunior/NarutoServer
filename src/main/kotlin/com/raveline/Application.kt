package com.raveline

import io.ktor.server.application.*
import com.raveline.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureKoin()
    configureSerialization()
    configureMonitoring()
    configureHTTP()
    configureRouting()
    configureStatusPage()
}
