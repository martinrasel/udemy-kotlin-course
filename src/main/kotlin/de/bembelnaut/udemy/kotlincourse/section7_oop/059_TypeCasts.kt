package de.bembelnaut.udemy.kotlincourse.section7_oop

/**
 * Type Casts
 */
fun main() {

    var mA = AABB()
    var mB = AACC()
    var mC = BBCC()

    var mArray = arrayOf(mA, mB, mC)

    for ((index, x) in mArray.withIndex()) {

        // "is" kann auch negiert werden: x !is AA
        if (x is AA) {
            println("$index is AA")

            // Hier muss kein cast mehr gemacht werden, weil im if-Statement schon explizit auf AA gefragt wurde.
            // Der Compiler weiß nun, dass hier keine andere Klasse drin sein kann.
            // Ausserhalb der klammer geht das nicht mehr.
            x.print()
        } else {
            println("$index is not AA")
        }
    }

    var mInterface: BB = mC
    // Hier ist ein unsafed cast! d.h. es wird hart auf eine andere Klasse gecastet! Es es fliegt eine ClassCastException
    // var mAInterface: AA = mInterface as AA
    // mAInterface.print()

    // Alternative 1: maybe-Type und mit null initialisieren. Danach mit is abfragen
    var mAInterface2: AA? = null
    if (mAInterface2 is BB) {
        mAInterface2 = AABB()
    }
    // Hier würde dann keine ClassCastException fliegen, weil es null ist
    mAInterface2?.print()

    // Alternative 2: as?
    // as? liefert ein null zurück wenn es nicht passt
    var mUnsafeInterface: AA? = mC as? AA

    println("alternative 2")
    mUnsafeInterface?.print()
}

interface AA {
    fun print() {
        println("Beep")
    }
}

interface BB

interface CC

class AABB: AA, BB
class AACC: AA, CC
class BBCC: BB, CC
