package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Einschränkungen für generische Parameter
 */
fun main() {

    var suppe = Suppe<Champignon>(Champignon())
    suppe.zubereiten()
    suppe.essen()

    var suppe2 = Suppe<Zwiebel>(Zwiebel())
    suppe2.zubereiten()
    suppe2.essen()
}

interface Scheidbar {
    fun schneiden() {
        println("Geschnitten")
    }
}

class Champignon: Scheidbar
class Zwiebel: Scheidbar

// Der Generic wir eingeschränkt, dass es vom Interface Schneidbar sein muss
class Suppe<T: Scheidbar>(var zutat : T) {
    var fertig = false

    fun zubereiten() {
        zutat.schneiden()

        fertig = true
    }

    fun essen() {
        if (fertig) {
            println("Lecker...")
        }
    }
}