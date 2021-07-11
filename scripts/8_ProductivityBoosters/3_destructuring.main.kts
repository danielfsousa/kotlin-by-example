#!/usr/bin/env kotlin

// destructuring lists
val (x, y, z) = arrayOf(5, 10, 15)

// destructuring maps
val map = mapOf("Alice" to 21, "Bob" to 25)
for ((name, age) in map) {
    println("$name is $age years old")
}

// Built-in Pair and Triple types support destructuring too, even as return values from functions.
fun findMinMax(numbers: List<Int>): Pair<Int?, Int?> {
    return Pair(numbers.minOrNull(), numbers.maxOrNull())
}
val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))

// Data class automatically defines the component1() and component2() methods
// that will be called during destructuring.
data class User(val username: String, val email: String)

fun getMyUser() = User("Mary", "mary@somewhere.com")

val user = getMyUser()
val (username, email) = user
println(username == user.component1())
val (_, emailAddress) = getMyUser()

class MyPair<K, V>(private val first: K, private val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

val (num, name) = MyPair(1, "one")
println("num = $num, name = $name")
