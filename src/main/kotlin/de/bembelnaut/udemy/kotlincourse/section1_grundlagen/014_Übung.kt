package de.bembelnaut.udemy.kotlincourse.section1_grundlagen

/**
 * Übung
 */
fun main() {

    val mArray = arrayOf(121, 2131,4121,12313,34234243,43523,134325,343,325342,23,2342342,234)

    // Suche das größte Element in der Liste mit einer Schleife
    var mostLive: Int = 0;
    for(index in mArray.indices) {
        if (mArray[index] > mostLive) {
            mostLive = mArray[index]
        }
    }
    println(mostLive);

    // Suche das größte Element in der Schleife
    mostLive = mArray.reduce() { mostLive, i -> if (i > mostLive) i else mostLive }
    println(mostLive)
}
