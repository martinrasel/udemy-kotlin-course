package de.bembelnaut.udemy.kotlincourse.section13_oop_erweitert

/**
 * Operatoren überladen
 */
fun main() {

    var x: Int = 42
    // + Operator
    println(x + 23)

    var v1: Vektor = Vektor(19, 100)
    var v2: Vektor = Vektor(100, 100)

    var v3 = v1 + v2
    println("Result v3: ${v3.x} / ${v3.y}")

    v3 = v1 - v2
    println("Result v3: ${v3.x} / ${v3.y}")

    v3 = v1 * v2
    println("Result v3: ${v3.x} / ${v3.y}")

    v3 = v1 / v2
    println("Result v3: ${v3.x} / ${v3.y}")

    v3 = v1 % v2
    println("Result v3: ${v3.x} / ${v3.y}")

    var vektorList = v1 .. v2
    println("Result : ${vektorList.size}")

}

class Vektor(var x: Int, var y: Int) {

    // Alle überschriebenen Operatoren müssen mit dem Schlüsselwort operator markiert werden
    operator fun plus(v2: Vektor): Vektor =
        Vektor(x + v2.x, y + v2.y)

    operator fun minus(v2: Vektor): Vektor =
        Vektor(x - v2.x, y - v2.y)

    operator fun times(v2: Vektor): Vektor =
        Vektor(x * v2.x, y * v2.y)

    operator fun div(v2: Vektor): Vektor =
        Vektor(x / v2.x, y / v2.y)

    operator fun rem(v2: Vektor): Vektor =
        Vektor(x % v2.x, y % v2.y)

    operator fun rangeTo(v2: Vektor): List<Vektor> {
        var xMin = x
        var xMax = v2.x
        if (x > v2.x) {
            xMax = xMin.also { xMin = xMax }
        }

        var yMin = y
        var yMax = v2.y
        if (y > v2.y) {
            yMax = yMin.also { yMin = yMax }
        }

        var result = mutableListOf<Vektor>()
        for (i in xMin..xMax) {
            for (j in yMin..yMax) {
                result.add(Vektor(i, j))
            }
        }
        return result
    }

}