#!/usr/bin/env kotlin

import kotlin.math.abs

val shuffled = listOf(5, 4, 2, 1, 3, -10)
val natural = shuffled.sorted()
val inverted = shuffled.sortedBy { -it }
val descending = shuffled.sortedDescending()
val descendingBy = shuffled.sortedByDescending { abs(it) }

println("shuffled: $shuffled")
println("natural: $natural")
println("inverted: $inverted")
println("descending: $descending")
println("descendingBy: $descendingBy")
