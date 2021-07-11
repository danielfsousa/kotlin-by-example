#!/usr/bin/env kotlin

fun format(userName: String, domain: String): String {
    return "$userName@$domain"
}

println(format("mario", "example.com"))
println(format(userName = "foo", domain = "bar.com"))
println(format(domain = "frog.com", userName = "pepe"))
