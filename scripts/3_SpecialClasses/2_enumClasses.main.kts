#!/usr/bin/env kotlin

// Enum classes are used to model types that represent a finite set of distinct values,
// such as directions, states, modes, and so forth.
enum class State {
    IDLE,
    RUNNING,
    FINISHED
}

// Enums may contain properties and methods like other classes,
// separated from the list of instances by a semicolon.
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

val state = State.RUNNING
val message =
    when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }

println(message)

val red = Color.RED
println(red)
println(red.containsRed())
println(Color.BLUE.containsRed())
println(Color.YELLOW.containsRed())
