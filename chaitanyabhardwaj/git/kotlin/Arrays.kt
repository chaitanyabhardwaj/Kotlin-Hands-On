package chaitanyabhardwaj.git.kotlin

import java.math.*

fun main() {
    
    val longArr = arrayOf(1L, 2L, 3L) //Array<Long>
    println(longArr is Array<Long>)

    var arr = arrayOf(1,2,3) //Array<Int>
    println(arr is Array<Int>)
    //arr = arrayOf(1L,2L,4L) //Note: We cannot change the type again from Array<Int> to Array<Long>
    arr = arrayOf(4,5,6) // Array<Int>
    println(arr is Array<Int>)

    //Specialized int array method.
    //This is better than calling Array<Int> in terms of performance
    //Also, we using primitive types, for instance
    //when passing array in java from Kotlin, always use this type of declaration
    var intArr = intArrayOf(1,2,3,4)
    println(intArr is IntArray)

    intArr = arr.toIntArray() //Converted to IntArray from Array<Int>
    println(intArr is IntArray)

    arr = intArr.toTypedArray() //Converted to Array<Int> from IntArray
    println(arr is Array<Int>)

    val evenNumbers = Array(16) {i -> i * 2}
    println("Store and print first 16 even numbers:")
    for(n in evenNumbers) print("$n ")
    println()

    //Declaring arrays without initializing
    val arrNew = Array<Int>(10){0}
    //fill array with numbers from 1 to 10
    for(i in arrNew.indices)
        arrNew[i] = i + 1
    for(n in arrNew) print("$n ")
    println()

    intArr = IntArray(10) //Notice how we don't need to pass initialzers in typed array
    for(n in intArr) print("$n ")
    println()

    val mixedArr = arrayOf<Any>("hello", 22, BigDecimal(10.5), 'a') // Array<Any> type by default
    println(mixedArr is Array<Any>)


}