package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")

    var mMapListe = mListe2.map { it + 10 }
    println("mMapListe: $mMapListe")

    var mMapListe2 = mListe2.map { listOf<Int>(it * it, it * it * it, it * it * it * it) }
    println("mMapListe2: $mMapListe2")
}