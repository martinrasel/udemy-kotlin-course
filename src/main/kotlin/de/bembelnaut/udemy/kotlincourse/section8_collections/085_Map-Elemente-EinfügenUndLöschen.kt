package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Map Elemente einfügen und entfernen
 */
fun main() {

    var mLinkedMap: Map<String, Int> = linkedMapOf(
        Pair("Martin", 43),
        "Nathalie" to 42)

    val mKinderMap = linkedMapOf<String, Int>(
        "Sofia" to 10,
        "Isobel" to 10,
        "Megan" to 10,
        "Santi" to 15
    )

    // Hinzufügen erzeugt eine neue Map
    // Man kann einzelne Elemente hinzufügen oder auch ganze Maps
    mLinkedMap += "David" to 12
    mLinkedMap += mKinderMap

    for ((name, alter) in mLinkedMap) {
        println("Name $name und Alter $alter")
    }

    println("---------------")

    // Entfernen geht dann entweder mit einer Collection von keys oder mit mehreren
    mLinkedMap -= "David"
    mLinkedMap -= mKinderMap.keys

    for ((name, alter) in mLinkedMap) {
        println("Name $name und Alter $alter")
    }
}