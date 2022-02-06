package de.bembelnaut.udemy.kotlincourse.section14_java_und_kotlin

/**
 * Kotlin kann Java einfach aufrufen...
 */
fun main() {

    val s = Hello.print("Hello World!")
    println(s)

    val hello = Hello()
    hello.printMe("Geht gut!")

}