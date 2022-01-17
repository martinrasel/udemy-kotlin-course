package de.bembelnaut.udemy.kotlincourse.section2

fun main() {

    var mInt = 32
    println("Int ist gleich $mInt und das ist auch gut so")

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