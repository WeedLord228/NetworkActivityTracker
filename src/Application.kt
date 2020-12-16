package ru.y

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    routing {
        get("/") {
            call.respondText("Wow wow wow wow wow wow", ContentType.Text.Plain)
        }
        post("/"){
            val request = call.receive<String>()
            call.respondText("received $request")
        }
    }
}