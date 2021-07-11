#!/usr/bin/env kotlin

val map = mapOf("key" to 42)

// When applied to a map, [] operator returns the value corresponding to the given key,
// or null if there is no such key in the map.
val value1 = map["key"]
val value2 = map["key2"]

// getValue function returns an existing value corresponding to the given key
// or throws an exception if the key wasn't found.
val value3: Int = map.getValue("key")

// For maps created with withDefault,
// getValue returns the default value instead of throwing an exception.
val mapWithDefault = map.withDefault { k -> k.length }
val value4 = mapWithDefault.getValue("key2")

try {
    map.getValue("anotherKey")
} catch (e: NoSuchElementException) {
    println("Message: $e")
}
