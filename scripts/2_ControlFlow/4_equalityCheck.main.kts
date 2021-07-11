#!/usr/bin/env kotlin

val authors = setOf("Shakespeare", "Hemingway", "Twain")
val writers = setOf("Twain", "Shakespeare", "Hemingway")

// Kotlin uses == for structural comparison and === for referential comparison.
// More precisely, a == b compiles down to if (a == null) b == null else a.equals(b).

// Returns true because it calls authors.equals(writers) and sets ignore element order.
println(authors == writers)

// Returns false because authors and writers are distinct references.
println(authors === writers)
