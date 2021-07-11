#!/usr/bin/env kotlin

val fruitsBag = listOf("apple", "orange", "banana", "grapes")
val clothesBag = listOf("shirts", "pants", "jeans")
val cart = listOf(fruitsBag, clothesBag)
val mapBag = cart.map { it }
val flatMapBag = cart.flatMap { it }
