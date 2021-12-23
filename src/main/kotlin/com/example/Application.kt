package com.example

import com.example.plugins.*
import io.ktor.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureFreeMarker()//FreeMarker get Template from server.
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureStatusPages()
    configureDefaultHeader()
}