#!/usr/bin/env kotlin

// The Kotlin standard library contains a bunch of useful delegates, like lazy, observable
// and others. You may use them as is. For example lazy is used for lazy initialization.

class LazySample {
    init {
        println("created!")
    }

    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }
}

val sample = LazySample()
println("lazyStr = ${sample.lazyStr}")
println(" = ${sample.lazyStr}")

// Property delegation can be used for storing properties in a map.
// This is handy for tasks like parsing JSON or doing other "dynamic" stuff.

class User(map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

val user = User(
    mapOf(
        "name" to "John Doe",
        "age" to 25
    )
)

println("name = ${user.name}, age = ${user.age}")
