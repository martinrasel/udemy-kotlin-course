package de.bembelnaut.udemy.kotlincourse.section2_feature

/**
 * Nullable Boolean-Type
 */
fun main() {

    var mBoolean: Boolean? = null // null, true, false

    if (mBoolean == true) {
        println(mBoolean)
    } else {
        println("false oder null")
    }

}