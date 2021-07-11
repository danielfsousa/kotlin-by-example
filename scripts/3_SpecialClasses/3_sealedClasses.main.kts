#!/usr/bin/env kotlin

/*
    Sealed classes let you restrict the use of inheritance.
    Once you declare a class sealed, it can only be subclassed from
    inside the same package where the sealed class is declared.
    It cannot be subclassed outside of the package where the sealed class is declared.
*/

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)

class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    // The else-case is not necessary here since all possible subclasses
    // of the sealed class are covered. With a non-sealed superclass else would be required.
    return when (mammal) {
        is Human -> "Hello ${mammal.name}; You are working as a ${mammal.job}"
        is Cat -> "Hello ${mammal}name"
        else -> "ops"
    }
}

println(greetMammal(Cat("Snowy")))
