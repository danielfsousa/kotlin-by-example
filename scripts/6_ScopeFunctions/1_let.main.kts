#!/usr/bin/env kotlin

// The Kotlin standard library function let can be used for scoping and null-checks.
// When called on an object, let executes the given block of code
// and returns the result of its last expression.
// The object is accessible inside the block by the reference it (by default) or a custom name.

val empty = "test".let {
    print(it)
    it.isEmpty()
}
println(" is empty: $empty")

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {
        print("\t")
        print(it)
        println()
    }
}

fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstString ->
        strTwo?.let { secondString ->
            print("$firstString : $secondString")
            println()
        }
    }
}

printNonNull(null)
printNonNull("my string")
printIfBothNonNull("First", "Second")
