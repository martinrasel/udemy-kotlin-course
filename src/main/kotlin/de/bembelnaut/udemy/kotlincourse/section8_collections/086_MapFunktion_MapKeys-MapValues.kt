package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * MapKeys und MapValues
 */
fun main() {

    var mLinkedMap: Map<String, Int> = linkedMapOf(
        Pair("Martin", 43),
        "Nathalie" to 42)

    // Überschreibt die Keys in einer Map. Es wird aber eine neue Map erstellt
    mLinkedMap = mLinkedMap.mapKeys { pair -> pair.key + " Foo" }

    for ((name, alter) in mLinkedMap) {
        println("Name $name und Alter $alter")
    }

    println("---------------")

    // Überschreibt die Values in einer Map. Es wird aber eine neue Map erstellt
    mLinkedMap = mLinkedMap.mapValues { pair -> pair.value + 100 }

    for ((name, alter) in mLinkedMap) {
        println("Name $name und Alter $alter")
    }
}