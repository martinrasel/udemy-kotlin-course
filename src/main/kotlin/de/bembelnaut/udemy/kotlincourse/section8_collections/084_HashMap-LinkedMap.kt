package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Weitere Map-Typen: HashMap und LinkedMap
 */
fun main() {

    // Reihenfolge ist gegeben, der direkte Zugriff langsamer. Dafür ist der Zugriff bei Listen-Operationen
    // schneller, da hier über die Liste geloopt wird.
    val mLinkedMap: Map<String, Int> = linkedMapOf(
        Pair("Martin", 43),
        "Nathalie" to 42)

    // Bei dein HashMap ist der direkte Zugriff über den Key sehr schnell, da aus dem Key ein Hash errechnet wird.
    // Dafür ist eine HashMap aber bei Listen-Operationen langsamer
    val mHashMap: Map<String, Int> = hashMapOf(
        Pair("Martin", 43),
        "Nathalie" to 42)

    // In Kotlin wird bei mapOf() eine LinkedMap erstellt.
}