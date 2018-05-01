@file:JvmName("StaticCar")

package academy.learnprogramming.kotlincode

import java.io.IOException

fun topLevel() = println("I'm in the Car file!")

fun main(args: Array<String>) {
    "Print this".print()
}

@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {

}

@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

object SingletonObj {
    @JvmStatic fun doSomething() = println("I'm doing something in the singleton object")
}

class Car(val color: String, @JvmField val model: String, val year: Int) {

    companion object {
        const val constant = 25
        @JvmField val isAuto = false
        @JvmStatic fun carComp() = println("I'm in Car's companion object")
    }

    fun printMe(text: String) {
        println("I don't expect a null value")
    }



//    var color: String = color
//    private set(value) {
//        field = "always green"
//    }
}

fun String.print() {
    println(this)
}