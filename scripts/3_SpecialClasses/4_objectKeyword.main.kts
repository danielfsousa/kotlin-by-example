#!/usr/bin/env kotlin

/*
In Kotlin you also have the object keyword. It is used to obtain a data type
with a single implementation.

If you are a Java user and want to understand what "single" means,
you can think of the Singleton pattern: it ensures you that only one instance
of that class is created even if 2 threads try to create it.

To achieve this in Kotlin, you only need to declare an object: no class, no constructor,
only a lazy instance. Why lazy?Because it will be created once when the object is accessed.
Otherwise, it won't even be created.
*/

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 30 * festivityDays
        var special: Int = 30 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")
}

object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

/*
An object declaration inside a class defines another useful case:the companion object.
Syntactically it's similar to the static methods in Java:
you call object members using its class name as a qualifier.

If you plan to use a companion object in Kotlin,
consider using a package-level function instead.
*/

class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                print("BONG ")
            }
        }
    }
}

rentPrice(10, 2, 1)
DoAuth.takeParams("foo", "qwerty")
BigBen.getBongs(12)
