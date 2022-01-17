package de.bembelnaut.udemy.kotlincourse.section1

/**
 * Übung
 */
fun main() {

    println(fac(5))

}

// Rekursive Funktion für Berechnung der Fakultät
fun fac(x: Int) : Int {
  if (x <= 1) {
      return 1
  } else {
      return x * fac(x - 1)
  }
}