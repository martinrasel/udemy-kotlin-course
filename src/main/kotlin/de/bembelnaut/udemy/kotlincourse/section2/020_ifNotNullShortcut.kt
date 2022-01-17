package de.bembelnaut.udemy.kotlincourse.section2

import de.bembelnaut.udemy.kotlincourse.section1.facultaet

fun main() {

    // maybe null
    var mString: String? = null

    // WICHTIG! null und "" sind unterschiedlich und der ?: wertet es nur nach null aus. nicht nach leer

    // if not null, dann alternative
    println(mString?.length ?: "Möööp")

    // geht auch bei initialisierung
    val length: Int = mString?.length ?: 0
    println(length)

    // wird ein nullable übergeben oder verarbeitet, und es ggf weiter gegeben wird, dann muss
    // die zuweisung auch nullable sein
    var lengthNullable: Int? = mString?.length
    println(length)

    // es kann auch für ein funktionsaufruf genutzt werden
    val mFacultaet: Int = mString?.length ?: facultaet(5)

    // function let wird ausgeführt, wenn mFacultaet nicht null ist
    mFacultaet?.let {
        println("Nicht null, sondern " + it)
    }

    // kann auch für ein exit benutzt werden
    println("Wird angezeigt")
    mString?.length ?: return
    println("Wird nicht mehr angezeigt")
}