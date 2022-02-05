package de.bembelnaut.udemy.kotlincourse.section2_feature

/**
 * Swappen von Variablen
 */
fun main() {
    var a: Int = 32
    var b: Int = 123

    println("a= $a")
    println("b= $b")

    println("also...")

    // Innerhalbdes Lambdas wird mit den alten Werten gearbeitet.
    // Der Rückgabewert von der Funktion also ist aber "this", dass dem ursrünglich Wert von b entspricht.
    a = b.also { b = a }

    println("a= $a")
    println("b= $b")

    // It/This kann nicht überschrieben werden, da it (bzw. this) ein val ist
//    a = b.also {
//        // Compiler-Fehler
//        it = 2*b
//    }
}