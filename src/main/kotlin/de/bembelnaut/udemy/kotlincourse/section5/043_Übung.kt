package de.bembelnaut.udemy.kotlincourse.section5

/**
 * Übung
 */
fun main() {
    println(sin(1.0, 100))
}

fun sin(z: Double, len: Int): Double {
    var result: Double = 0.0

    for (n in 0..len) {
        var x = myPower(-1.0, n)
        var y = myPower(z, (2*n +1))
        var foo = myFac((2*n + 1))

        result += ((x * y) / foo)
    }

    return result
}

fun myPower(base: Double, exp: Int): Double {
    if (exp <= 0) {
        return if (base <= 0)
            base * -1
        else
            base
    }
    return base * myPower(base, exp -1)
}

fun myFac(n: Int): Double {
    if (n <= 1) {
        return 1.0
    }
    return n * myFac(n - 1)
}
