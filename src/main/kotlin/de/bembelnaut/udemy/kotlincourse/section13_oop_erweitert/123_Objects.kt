package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Objects - Singelton
 */
fun main() {
    // Die beiden Variablen greifen auf das gleiche Singelton zu
    var mySingelton = MySingelton
    println("mySingelton: ${mySingelton.a}")
    mySingelton.increment()
    println("mySingelton: ${mySingelton.a}")

    var yourSingelton = MySingelton
    println("yourSingelton: ${yourSingelton.a}")
    yourSingelton.increment()
    println("yourSingelton: ${yourSingelton.a}")

    println("mySingelton: ${mySingelton.a}")
}

// Kotlin bietet hier eine Threadsafe Singelton Implementierung
object MySingelton {
    var a: Int = 42

    fun increment() {
        a++
    }
}