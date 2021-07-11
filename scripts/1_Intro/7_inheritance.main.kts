#!/usr/bin/env kotlin

open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

open class Tiger(private val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grhhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

// name in the Asiatic declaration is neither a var nor val: it's a constructor argument,
// whose value is passed to the name property of the superclass Lion.
class AsiaticLion(name: String) : Lion(name = name, origin = "India")

val dog: Dog = Yorkshire()
dog.sayHello()

val tiger: Tiger = SiberianTiger()
tiger.sayHello()

val lion: Lion = AsiaticLion("Rufo")
lion.sayHello()
