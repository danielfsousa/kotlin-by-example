#!/usr/bin/env kotlin

val numbers = listOf(1, -2, 3, -4, 5, -6)
val first = numbers.first()
val last = numbers.last()
val firstEven = numbers.first { it % 2 == 0 }
val lastOdd = numbers.last { it % 2 != 0 }

val words = listOf("foo", "bar", "baz", "faz")
val empty = emptyList<String>()
val first = empty.firstOrNull()
val last = empty.lastOrNull()
val firstF = words.firstOrNull { it.startsWith('f') }
val firstZ = words.firstOrNull { it.endsWith('z') }
val lastF = words.lastOrNull { it.endsWith('f') }
val lastZ = words.lastOrNull { it.endsWith('z') }
