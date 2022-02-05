package de.bembelnaut.udemy.kotlincourse.section7_oop


/**
 * Extension-Functions
 */
fun main() {

    var mZauberhut = Zauberhut()
    println("Es befinden sich ${mZauberhut.mTaubenListe.size} Tauben im Hut!")

    mZauberhut.createTaube()
    mZauberhut.createTaube()
    mZauberhut.createTaube()
    mZauberhut.createTaube()

    println("Nun befinden sich ${mZauberhut.mTaubenListe.size} Tauben im Hut!")
    println("---------")

    // Die Extension wird direkt an die Klasse gehängt und steht nur ihr bereit!
    var y: Y = Y()
    y.print()
    println("---------")

    // Extension von Klasse X, kann für Unterklasse Y benutzt werden.
    // Sollten innerhalb der X-Extensions andere Extention aufgerufen
    // werden, die auch Y hat, dann werden nicht die Extensions der Y-Unterklasse
    // aufgerufen, sondern die der X-Klasse.
    println("X-Extension fooBar auf y aufgerufen")
    y.fooBar()

    println("---------")
    println("Y Downcast auf X")
    // Downcast...
    var x: X = y as X
    x.print()

    println("---------")
    println("Y-Extension vs. Member-Mathode")
    y.doIt()

}

class Zauberhut {
    var mTaubenListe: MutableList<String> = mutableListOf()
}

// Extensions haben zugriff auf die Klasse
fun Zauberhut.createTaube() {
    println("Hokuspokus...")
    mTaubenListe.add("Huuhuu")
}

// noch etwas anderes...
open class X
class Y: X() {
    fun doIt() {
        println("Keiner macht DO IT! Nur KLASSE Y!")
    }
}

fun X.print() {
    println("Ich bin eine Extension von X")
}

fun Y.print() {
    println("Ich bin eine Extension von Y")
}

fun Y.doIt() {
    println("Y-Extension can DoIT")
}

fun X.fooBar() {
    // print() Extension von X
    print()
}