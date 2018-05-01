@file:JvmName("StaticCar")

package academy.learnprogramming.kotlincode

fun topLevel() = println("I'm in the Car file!")

fun main(args: Array<String>) {
    "Print this".print()
}

class Car(val color: String, val model: String, val year: Int) {
//    var color: String = color
//    private set(value) {
//        field = "always green"
//    }
}

fun String.print() {
    println(this)
}