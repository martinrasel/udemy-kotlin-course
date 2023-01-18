package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Generate Sequence erstellt eine Sequence, die z.B. mit einem Iterator aufgerufen werden kann.
 * Die Sequence wird dabei immer erneut berechnet, bis sie intern null zurückliefert.
 */
fun main() {

    var count = 3

    val sequence = generateSequence {
        (count--).takeIf { it > 0 } // will return null, when value becomes non-positive,
        // and that will terminate the sequence
    }

    println(sequence.toList()) // [3, 2, 1]

    // sequence.forEach {  }  // <- iterating that sequence second time will fail

}