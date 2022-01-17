package de.bembelnaut.udemy.kotlincourse.section8

fun main() {
    var mListe1 = listOf(3,3,3,3,3)
    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe1: $mListe1")
    println("mListe2: $mListe2")

    // zip hört nach dem letzten element der kürzeren liste auf
    var mListe3 = mListe2.zip(mListe1)
    println("mListe3: $mListe3")

    var mListe33 = mListe3.zip(mListe2)
    println("mListe33: $mListe33")

    // unzip hört nach dem letzten element der kürzeren liste auf
    var mListe4 = mListe3.unzip()
    println("mListe4: ${mListe4.first}")
    println("mListe4: ${mListe4.second}")
}