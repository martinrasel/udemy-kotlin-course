package de.bembelnaut.udemy.kotlincourse.section2_feature

/**
 * String-Templates
 */
fun main() {

    // Variablen können in ein String verwurschtelt werden
    var mInt = 32
    println("Int ist gleich $mInt und das ist auch gut so")

    // Es können auch Funktionen mit ${ ... } innerhalb eines Strings ausgeführt werden
    var mString: String? = null
    println("String ist null, daher ${mString?.let { println("OMG!") } ?: "-"} geht das hier" )

    mString = "mööp"
    println("String ist leer, daher ${mString?.let { print("OMG!") }} geht das hier" )

    println("String mit if zuweisung, daher ${if (true) {
        "w"
    } else {
        "b"
    }
    } geht das hier" )
}