package de.bembelnaut.udemy.kotlincourse.section12_funktionale_erweitert

/**
 * Lokale Funktion
 */
fun main() {
    val myClass = LokaleF109()
    myClass.printMe()
    myClass.printAll()

    // Hier kann man auch eine interne Funktion haben
    fun hello() {
        println("Hello")
    }

    // Die interne Funktion kann aber nur nach der definition aufgerufen werden.
    hello()
}

class LokaleF109 {
    var x = 10

    fun printMe() {
        // Funktion intern() kann nur in printMe() benutzt werden.
        fun intern(a: Int): Int {
            println("Innerhalb der lokalen Funktion")
            return x * a
        }

        println("Ausserhalb der lokalen Funktion ${intern(42)}")
    }

    fun printAll() {
        // Die Funktion intern ist nicht in dieser Methode erreichbar.
        // println("Ausserhalb der lokalen Funktion ${intern(42)}")
        println("Möööp")

        // Die Funktion kann aber indirekt aufgerufen werden.
        printMe()
    }
}