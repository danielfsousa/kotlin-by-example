#!/usr/bin/env kotlin

fun main() {
    val configuration = object {
        var host: String = "google.com"
        var port: Int = 8080
    }

    // with is a non-extension function that can access members of its argument concisely:
    // you can omit the instance name when referring to its members.
    with(configuration) {
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}

main()
