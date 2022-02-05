package de.bembelnaut.udemy.kotlincourse.section2

import de.bembelnaut.udemy.kotlincourse.section1.fac

/**
 * if not null Shortcut
 */
fun main() {

    // maybe null
    var mString: String? = null

    // WICHTIG! null und "" sind unterschiedlich und der ?: wertet es nur nach null aus, nicht ob es leer ist

    // if not null, ansonsten Alternative ausgeben
    println(mString?.length ?: "Möööp")

    // Geht auch bei initialisierung
    val length: Int = mString?.length ?: 0
    println(length)

    // Wird ein nullable übergeben oder verarbeitet, und es ggf weitergegeben wird, dann muss
    // die Zuweisung auch nullable sein
    var lengthNullable: Int? = mString?.length
    println(length)

    // Es kann auch für ein Funktionsaufruf genutzt werden
    val mFacultaet: Int = mString?.length ?: fac(5)

    // Die Inline-Funktion let wird ausgeführt, wenn mFacultaet nicht null ist
    mFacultaet?.let {
        println("Nicht null, sondern " + it)
    }

    // Es kann auch z.B. für ein Exit benutzt werden
    println("Wird angezeigt")
    mString?.length ?: return
    println("Wird nicht mehr angezeigt")
}