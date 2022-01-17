package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Strings
 */
fun main() {
    val myString: String = "Hello World"

    println(myString)

    // Trippel-Quotet Strings
    var mString: String = """
        > haha
        > das ist wirklich
        > nicht lustig!!
    """.trimIndent()

    println(mString)

    mString = """
        >   haha
        >das ist wirklich
        >   nicht lustig!!
    """.trimMargin(">")

    println(mString)
}