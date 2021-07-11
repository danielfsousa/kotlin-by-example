#!/usr/bin/env kotlin

val letters = listOf("a", "b", "c")
val numbers = listOf(1, 2, 3, 4)

val resultPairs = letters zip numbers
val resultReduce = letters.zip(numbers) { l, n -> "$l$n" }

println("resultPairs: $resultPairs")
println("resultReduce: $resultReduce")
