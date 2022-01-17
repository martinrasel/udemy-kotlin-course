package de.bembelnaut.udemy.kotlincourse.section7

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

fun main() {

    var mA = AABB()
    var mB = AACC()
    var mC = BBCC()

    var mArray = arrayOf(mA, mB, mC)

    for ((index, x) in mArray.withIndex()) {

        // "is" kann auch negiert werden: x !is AA
        if (x is AA) {
            println("$index is AA")

            // hier muss kein cast mehr gemacht werden, weil im if-Statement schon explizit auf AA gefragt wurde
            // ausserhalb der klammer geht das nicht mehr.
            x.print()
        } else {
            println("$index is not AA")
        }
    }

    var mInterface: BB = mC
    // unsafed cast! auspassen!
    // var mAInterface: AA = mInterface as AA

    // wird eine classCastException werfen!
    //mAInterface.print()

    // alternative 1: nullable
    var mAInterface2: AA? = null
    if (false) { // i.d.r. mit "is"
        mAInterface2 = AABB()
    }
    // hier fliegt keine ClassCastException, weil es null ist
    mAInterface2?.print()

    // alternative 2: as?
    var mUnsafeInterface: AA? = mC as? AA

    println("alternative 2")
    // es passiert kein Fehler, da es durch den ungültigen Cast nicht gesetzt ist
    mUnsafeInterface?.print()
}