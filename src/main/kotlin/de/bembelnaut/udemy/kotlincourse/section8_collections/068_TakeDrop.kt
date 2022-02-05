package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen-Operationen: Take und Drop
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // Take nimmt die ersten n-ten Elemente aus einer Liste
    var takeListe = mBasicList.take(2)
    println("takeListe: $takeListe")

    // Drop nimmt ab den ersten n Elementen aus einer Liste
    var dropListe = mBasicList.drop(2)
    println("dropListe: $dropListe")

    // Übung! bääm!
    var resultList = mBasicList.insert(3, 9)
    println("resultList: $resultList")
}

fun List<Int>.insert(position: Int, number: Int) : List<Int> =
    this.take(position) + number + this.drop(position)
