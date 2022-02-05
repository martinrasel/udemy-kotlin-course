package de.bembelnaut.udemy.kotlincourse.section1_grundlagen

/**
 * Übung zu For-Schleife
 */
fun main() {
    val message: String = "Hello World!"
    var mCodedMessage: String = ""

    for (index in message.indices) {
        mCodedMessage += message[index] + 3
    }

    println(message)
    println(mCodedMessage)

    // advanced chiper
    for (index in mCodedMessage.indices){
        print(mCodedMessage[index])
        if((index + 1).mod(5) == 0) {
            println()
        }
    }
}