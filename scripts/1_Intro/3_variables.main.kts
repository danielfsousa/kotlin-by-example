#!/usr/bin/env kotlin

fun someCondition() = true

fun main() {
    val d: Int
    var a = "initial: "

    if (someCondition()) {
        a = "edited: "
        d = 1
    } else {
        d = 2
    }

    println(a + d)
}

main()
