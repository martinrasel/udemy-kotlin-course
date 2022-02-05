package de.bembelnaut.udemy.kotlincourse.section8_collections

/**
 * Zip und Unzip
 */
fun main() {

    // Zip und Unzip fügt zwei Listen zusammen und bildet dabei Tupel (Pairs)
    var mBasicList = listOf(3,3,3,3,3)
    var mBasicList2 = listOf(0,4,1,2,3,4,5)
    println("mBasicList: $mBasicList")
    println("mBasicList2: $mBasicList2")

    // zip hört nach dem letzten Element der kürzeren Liste auf
    var mZipedList = mBasicList2.zip(mBasicList)
    println("mZipedList: $mZipedList")

    var mZippedZipList = mZipedList.zip(mBasicList2)
    println("mZippedZipList: $mZippedZipList")

    // unzip erstelle ein Pair von Listen und hört nach dem letzten Element der kürzeren Liste auf
    var mUnzipList = mZipedList.unzip()
    println("mUnzipList - first list: ${mUnzipList.first}")
    println("mUnzipList - second list: ${mUnzipList.second}")
}