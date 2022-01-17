package de.bembelnaut.udemy.kotlincourse.section8

import java.text.FieldPosition

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")

    // Take nimmt die n-ten Elemente aus einer Liste
    var takeListe = mListe2.take(2)
    println("takeListe: $takeListe")

    // Drop nimmt ab den ersten n Elementen aus einer Liste
    var dropListe = mListe2.drop(2)
    println("dropListe: $dropListe")

    // übung! bääm!
    var resultList = mListe2.insert(3, 9)
    println("resultList: $resultList")
}

fun List<Int>.insert(position: Int, number: Int) : List<Int> =
    this.take(position) + number + this.drop(position)
