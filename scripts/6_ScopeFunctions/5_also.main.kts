#!/usr/bin/env kotlin

data class Person(val name: String, var age: Int = 1, var about: String = "")

fun logPerson(person: Person) {
    println(person)
}

// also works like apply: it executes a given block and returns the object called.
// Inside the block, the object is referenced by it, so it's easier to pass it as an argument.
// This function is handy for embedding additional actions, such as logging in call chains.
val jake = Person("Jake").also {
    it.age = 30
    it.about = "Android developer"
    logPerson(it)
}
