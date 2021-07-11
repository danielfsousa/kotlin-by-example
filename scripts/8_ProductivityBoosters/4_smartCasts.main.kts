#!/usr/bin/env kotlin

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

// The Kotlin compiler is smart enough to perform type casts automatically in most cases, including:
// 1. Casts from nullable types to their non-nullable counterparts.
// 2. Casts from a supertype to a subtype.

val date: ChronoLocalDate? = LocalDate.now()

if (date != null) {
    println(date.isLeapYear)
}

if (date != null && date.isLeapYear) {
    println("It's a leap year!")
}

if (date == null || !date.isLeapYear) {
    println("There's no Feb 29 this year...")
}

if (date is LocalDate) {
    val month = date.monthValue
    println(month)
}
