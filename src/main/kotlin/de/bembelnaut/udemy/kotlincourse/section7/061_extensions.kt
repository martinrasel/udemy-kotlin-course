package de.bembelnaut.udemy.kotlincourse.section7

class Zauberhut {
    var mTaubenListe: MutableList<String> = mutableListOf()
}

fun Zauberhut.createTaube() { mTaubenListe.add("Huuhuu") }

// noch etwas anderes...
open class X
class Y: X() {
    fun doIt() {
        println("DO IT!")
    }
}

fun X.print() {
    println("XXX")
}

fun Y.print() {
    println("YYY")
}

fun Y.doIt() {
    println("Extenstion DoIT")
}

fun main() {

    var mZauberhut = Zauberhut()
    println("Es befinden sich ${mZauberhut.mTaubenListe.size} Tauben im Hut!")

    mZauberhut.createTaube()
    mZauberhut.createTaube()
    mZauberhut.createTaube()
    mZauberhut.createTaube()

    println("Es befinden sich ${mZauberhut.mTaubenListe.size} Tauben im Hut!")

    // die extension wird direkt an die klasse gehängt und steht nur ihr bereit!
    var y: Y = Y()
    y.print()

    var x: X = y as X
    x.print()

    // member funtionen schlagen extenstions
    y.doIt()

}