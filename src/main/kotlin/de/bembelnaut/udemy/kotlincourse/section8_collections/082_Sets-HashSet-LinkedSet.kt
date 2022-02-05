package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Set, HashSet und LinkedSet
 */
fun main() {

    // Set haben keine Doubletten
    // Eine Sortierung ist nicht gegeben. Die Reihenfolge entspricht der Befüllung
    var mBasicSet = setOf<Int>(9,2,7,1,2,4,5,6)
    println("mBasicSet: $mBasicSet")
    println("Füge eine 1 hinzu")
    mBasicSet += 1
    println("mBasicSet: $mBasicSet")

    // Das HashSet arbeitet anders. Hier sind auch keine Doubletten enthalten,
    // aber es gibt eine Sortierung. Die Reihenfolge geht aber verloren
    // Das HashSet ist schneller als ein Set.
    var mHashSet = hashSetOf<Int>(9,2,7,1,2,4,5,6)
    println("mHashSet: $mHashSet")
    println("Füge eine 3 hinzu")
    mHashSet += 3
    println("mHashSet: $mHashSet")

    // Das LinkedSet ist die Kombination von beiden.
    // Die Reihenfolge bleibt bestehen, es arbeitet aber intern mit Hash-Funktionen
    var mLinkedSet = linkedSetOf<Int>(9,2,7,1,2,4,5,6)
    println("mLinkedSet: $mLinkedSet")
    println("Füge eine 5 hinzu")
    mLinkedSet += 5
    println("mLinkedSet: $mLinkedSet")

    // Es gelten die gleichen Operationen wie bei Listen...
    mLinkedSet -= hashSetOf(1,2)
    println("mLinkedSet: $mLinkedSet")

    // Ein Set kann auch in eine Liste
    println("mLinkedSet toList(): ${mLinkedSet.toList()}")
}