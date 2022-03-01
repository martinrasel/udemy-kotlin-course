package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert


/**
 *
 */
// Das Schlüsselwort out signalisiert, dass die übergebene Klasse eine Kovarianz des Parameter T ist.
// Kovarianz bedeutet, dass die Typhierarchie mit der Vererbungshierarchie der zu betrachtenden Klassen
// die gleiche Richtung hat, z.B.: "Eine Liste ein Subtype von Collection ist"
interface Source<out T, out S: String> {
    // Kovarianz produzieren nur, die Variable m liefert ein T
    val m : T
    val s : S

    // Kovarianz produzieren nur, und können nicht als Parameter übergeben werden.
    fun getMyM(): T = m

    // Da S ein Subtype von String sein muss, kann hier ein String geliefert werden.
    fun getStringOfS(): String = s

    // Compiler-Fehler
    //fun add(n: T)
}

// Das Schlüsselwort in signalisiert, dass die übergebene Klasse eine Kontravarianz des Parameter T ist.
// Wenn die Typhierarchie entgegengesetzt zur Vererbungshierarchie der zu betrachtenden Klassen läuft,
// so spricht man von Kontravarianz.
interface Destination<in T> {
    // Compiler-Fehler da in nur konsumiert werden kann
    // val m : T
    // fun getMyT(): T

    // Kontravarianz kann nur konsumiert werden.
    fun add(n: T)
}

// Beispiel für Kontravarianz
interface Comparable<in T: Number> {
    operator fun compareTo(other: T): Int
}

fun demo(x: Comparable<Number>) {
    val myDouble: Double = 1.0
    val myFloat: Float = 2.3f
    // x kann als Parameter den Typ T und dessen Subklassen bearbeiten.
    // 1.0 has type Double, which is a subtype of Number
    x.compareTo(myDouble)
    x.compareTo(myFloat)

    // Da das Comparable<Double> mit Doubles arbeitet, und Double ein SubType
    // von Number ist, kann hier dem y das x übergeben werden.
    // Thus, you can assign x to a variable of type Comparable<Double>
    val y: Comparable<Double> = x // OK!

    y.compareTo(myDouble)
    //y.compareTo(myFloat)
}

/*
 * Beispiel von https://medium.com/kotlin-thursdays/introduction-to-kotlin-generics-9d18d3719e1d
 */
open class Mammal(val name: String) {
    fun eat() {}
    fun sleep() {}
}

data class Sloths(val slothName: String, val isTwoFingered: Boolean): Mammal(slothName)

data class Pandas(val pandaName: String) : Mammal(pandaName)

fun feedCrew(crew: List<Mammal>) { // List<out E> is covariant on its element type
    crew.forEach {
        it.eat()
    }
}

fun main() {
    val slothCrew = listOf(
        Sloths("Jerry", false),
        Sloths("Bae", true),
        Sloths("Chrissy", false),
    )

    val pandaCrew = listOf(
        Pandas("Jay"),
        Pandas("Peggy")
    )

    feedCrew(slothCrew)
    feedCrew(pandaCrew)

    // Contavariance
    val crewCrewCrew = listOf(
        Sloths("Jerry", false),
        Sloths("Bae", true),
        Sloths("Alex", false),
        Pandas("Tegan"),
        Pandas("Peggy")
    )

    // Die Parameter des Lambda sind von der Oberklasse Mammal.
    val compareByNames = Comparator { a: Mammal, b: Mammal ->
        a.name.first().toInt() - b.name.first().toInt()
    }

    // Die Liste enthält nur SubTypen.
    // Im Zusammenspiel: Die Subtypen werden im Comparator nur als Oberklassen betrachtet,
    // allerding die Oberklasse greift auf die Attribute der Subklasse zu.
    println(crewCrewCrew.sortedWith(compareByNames))
}