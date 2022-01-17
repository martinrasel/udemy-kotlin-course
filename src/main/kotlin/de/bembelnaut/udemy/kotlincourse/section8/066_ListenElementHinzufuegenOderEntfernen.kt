package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe1 = listOf<Int>(1,2,3,4,5)
    println(mListe1)

    // hinzufügen eines elements erzeugt eine neue liste
    var mListe2 = mListe1 + 6
    println(mListe2)
    println("Listen gleich? ${mListe1===mListe2}")

    // hinzufügen einer liste von elementen
    mListe2 += listOf<Int>(6,7,8,9)
    println(mListe2)

    // entfernt das erste Element (Zahl 6) aus der liste
    mListe2 -= 6
    println(mListe2)

    // entfernt alle Elemente aus der liste
    mListe2 -= listOf<Int>(1,3,5,7,9)
    println(mListe2)
}