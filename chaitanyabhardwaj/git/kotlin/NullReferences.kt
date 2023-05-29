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
    
    //not null assertion(!!)
    //this can be useful when we don't want to continue with a null value
    //uncomment below line to watch in-action
    //println(nStr!!.lowercase())//this will throw NullPointerException is the value is null
    println(nStr1!!.lowercase())//this will print the value
    
    //using not null when the paramter type is not nullable
    val nStr4: String? = "This is nullable String"
    val nStr5: String? = "This is another nullable String"
    val nStr6: String? = "This is yet another nullable String"
    //uncomment below line to watch in-action
    //printText(nStr4) //type mismatch: inferred type is String? but String was expected
    //Note: if we've already checked that the nullable object is actually not null
    //then this error goes away
    
    //solution to above problem:
    //1. null check
    if(nStr4 != null) printText(nStr4)
    //2. not null assertion
    //it's the same as above because here we are guaranteeing that nStr5 is not null
    //this will throw NullPointerException if nStr5 is null
    printText(nStr5!!)
    //3. let method
    //here we used null-safe operator(?.), let function and it keyword
    //The below statement means
    //if nStr6 is not null(?.), 'let' this lambda expression run where 'it' is the value of calling object
    nStr6?.let{ printText(it)}

    //Equals operator is null-safe
    val nStr7: String? = null
    val nStr8 = "This is a non-nullable String"
    println(nStr7 == nStr8)//this won't throw type mismatch exception as equals is null safe by default
}

fun printText(text: String) {
    println(text)
}