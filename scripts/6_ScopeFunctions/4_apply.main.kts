#!/usr/bin/env kotlin

data class Person(val name: String, var age: Int = 1, var about: String = "")

val jake = Person("Jake")

// apply executes a block of code on an object and returns the object itself.
// Inside the block, the object is referenced by this. This function is handy for initializing objects.
val stringDescription = jake.apply {
    age = 30
    about = "Android developer"
}.toString()

println(stringDescription)
