package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Maps
 */
fun main() {

    // Eine Map wir mit Pairs gefüllt oder mit "key to value"
    val mMap: Map<String, Int> = mapOf(
        Pair("Martin", 43),
        "Nathalie" to 42)

    for ((name, alter) in mMap) {
        println("Name $name und Alter $alter")
    }

    // Zugriff entweder mit get oder besser mit []
    println(mMap.get("Martin"))
    println(mMap["Nathalie"])
}