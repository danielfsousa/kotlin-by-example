#!/usr/bin/env kotlin

val numbers = listOf(1, -3, 3, -4, 5, -6)

val anyNegative = numbers.any { it < 0 }
val anyGT6 = numbers.any { it > 6 }

val allEven = numbers.all { it % 2 == 0 }
val allLess6 = numbers.all { it < 6 }

val allOdd = numbers.none { it % 2 == 0 }
val allGrater6 = numbers.none { it <= 6 }
