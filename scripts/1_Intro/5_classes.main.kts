#!/usr/bin/env kotlin

class Customer

class Contact(val id: Int, var email: String)

val customer = Customer()
val contact = Contact(1, "mary@gmail.com")
println(contact.id)
contact.email = "jane@gmail.com"
println(customer)
