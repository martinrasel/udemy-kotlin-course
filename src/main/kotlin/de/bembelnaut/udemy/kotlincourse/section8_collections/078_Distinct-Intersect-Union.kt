package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Listen-Operationen: Distinct, Intersect und Union
 */
fun main() {

    var mBasicList = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")

    // distinct erstellt eine neue Liste in der Doubletten ausgefiltert wurden.
    println("distinct: ${mBasicList.distinct()}")

    // intersect erstellt eine neue distincte Liste mit der Schnittmenge.
    // Die Reihenfolge des Ergebnisses ist die von ersten Liste.
    println("intersect: ${mBasicList.intersect(listOf(1, 2, 8, 9))}")

    // union erstellt eine neue distincte Liste der Vereinigungsmenge.
    // Es wird erst union ausgeführt und dann distinct.
    // Die Sortierung gibt die erstel Liste vor
    println("union: ${mBasicList.union(listOf(1, 2, 8, 9))}")

}