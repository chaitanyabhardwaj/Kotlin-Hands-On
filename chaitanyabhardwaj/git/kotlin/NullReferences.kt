package chaitanyabhardwaj.git.kotlin

fun main() {
    //val str: String = null //this will throw error: null can not be a value of a non-null type String
    val nStr: String? = null //this is a null type String
    val nInt: Int? = null //this is a null type Int

    //this will throw error:
    //only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver
    //println(nStr.lowercase())

    //what is safe asserted types
    println(nStr?.lowercase())//notice how this will print 'null' instead of throwing a null exception

    //the above expression (?.) is equal to using an if-else null check in java
    if(nStr != null) println(nStr.lowercase())
    else println("This is null")

    println(nInt)
    
    //if-else null checking,
    //in kotlin, we can use elvis operator to do the same
    var nStr1: String? = null
    //Elvis operator (?:) acts as 'else' for above statement
    println(nStr1?:"Null component")
    nStr1 = "Hello World!"
    println(nStr1?:"Null component")

    //safe casting
    val nInt1 = 123
    //This will throw class cast exception
    //val nStr2 = nInt1 as String
    val nStr3 = nInt1 as? String // this will place null in nStr3 instead of throwing exception
    println(nStr3)
}