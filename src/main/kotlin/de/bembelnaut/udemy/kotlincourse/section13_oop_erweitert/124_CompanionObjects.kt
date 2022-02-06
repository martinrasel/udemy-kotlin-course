package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Companions
 */
fun main() {

    var c1 = MyCompanion()
    var c2 = MyCompanion()

    println("c1.a: ${c1.a} / comp.b: ${MyCompanion.b}")
    println("c2.a: ${c2.a} / comp.b: ${MyCompanion.b}")

    with(c1) {
        incA()
        incB()
    }

    with(c2) {
        incA()
        incB()
    }

    println("c1.a: ${c1.a} / comp.b: ${MyCompanion.b}")
    println("c2.a: ${c2.a} / comp.b: ${MyCompanion.b}")

    MyCompanion.print()
}

class MyCompanion {

    var a: Int = 42

    // Companions sind Klassen Variablen bzw. Funktionen
    companion object {
        var b: Int = 23

        fun print() {
            println("Hello World! $b")
        }
    }

    fun incA() {
        a++
        println("a: $a")
    }

    fun incB() {
        b++
        println("b: $b")
    }
}