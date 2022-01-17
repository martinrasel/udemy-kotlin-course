package de.bembelnaut.udemy.kotlincourse.section8

fun main() {

    var mListe2 = listOf(0,4,1,2,3,4,5)
    println("mListe2: $mListe2")

    // distinct erstellt eine neue liste in der doubletten ausgefiltert wurden
    println("distinct: ${mListe2.distinct()}")

    // intersect erstellt eine neue distincte liste mit der schnittmenge; reihenfolge ist die von ersten liste
    println("intersect: ${mListe2.intersect(listOf(1, 2, 8, 9))}")

    // union erstellt eine neue distincte liste der vereinigungsmenge; erst union, dann distinct; sortierung wieder
    // nach der ersten liste
    println("union: ${mListe2.union(listOf(1, 2, 8, 9))}")

}