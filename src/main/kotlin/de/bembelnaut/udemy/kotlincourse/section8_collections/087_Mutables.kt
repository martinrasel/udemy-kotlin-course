package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Mutable Listen, Maps und Sets
 *
 * Sollten nicht so oft benutzt werden... ?
 */
fun main() {

    val mutableMap: MutableMap<String, Int> = mutableMapOf(
        "Foo" to 42,
        "Bar" to 23
    )

    // Hinzufügen wird über den Key erledigt. Es gibt auch eine put Methode.
    mutableMap["Hello"] = 23

    println("Maps")
    for ((name, alter) in mutableMap) {
        println("Name $name und Alter $alter")
    }

    println("---------------")

    println("Listen")
    val mutableList: MutableList<String> = mutableListOf()
    mutableList += "Hello"
    mutableList += listOf("Foo", "Bar")

    for (wort in mutableList) {
        println("wort $wort")
    }

    println("---------------")

    println("Set")
    val mutableSet = mutableSetOf("Hi", "Ho", "Foo")
    mutableSet += "Dou"

    for (wort in mutableSet) {
        println("wort $wort")
    }
}