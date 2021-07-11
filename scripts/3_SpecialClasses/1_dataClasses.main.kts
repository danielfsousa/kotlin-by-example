#!/usr/bin/env kotlin

/*
    Data classes make it easy to create classes that are used to store values.
    Such classes are automatically provided with methods for copying,
    getting a string representation, and using instances in collections.
    You can override these methods with your own implementations in the class declaration.
*/

data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) = other is User && other.id == this.id
}

val user = User("Alex", 1)
println(user)

val secondUser = User("Alex", 1)
val thirdUser = User("Max", 2)

println(user.hashCode())
println(secondUser.hashCode())
println(thirdUser.hashCode())

println(user.copy())
println(user === user.copy())
println(user.copy("Max"))
println(user.copy(id = 3))

println("name = ${user.component1()}")
println("id = ${user.component2()}")
