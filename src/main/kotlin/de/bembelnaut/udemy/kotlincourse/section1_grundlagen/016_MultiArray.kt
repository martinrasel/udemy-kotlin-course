package de.bembelnaut.udemy.kotlincourse.section1_grundlagen

/**
 * Multi-Arrays und Zugriff
 */
fun main() {

    var mMultiArray = arrayOf(
                        arrayOf(1,2,3,4,5,6,7,8),
                        arrayOf(11,12,13,14,15,16,17,18))

    // Zeile 2, Feld 5
    println(mMultiArray[1][4])

    var mMultiMultiArray = arrayOf(
                                // zeile 0
                                arrayOf(
                                    // zeile 0.0
                                    arrayOf(1,2,3),
                                    // zeile 0.1
                                    arrayOf(4,5,6),
                                    // zeile 0.2
                                    arrayOf(7,8,9)
                                ),
                                // zeile 1
                                arrayOf(
                                    // zeile 1.0
                                    arrayOf(11,12,13),
                                    // zeile 1.1
                                    arrayOf(14,15,16),
                                    // zeile 1.2
                                    arrayOf(17,18,19)
                                )
    )

    println(mMultiMultiArray[1][2][2])
}