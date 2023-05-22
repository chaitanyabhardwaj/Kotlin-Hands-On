package chaitanyabhardwaj.git.kotlin

fun main() {
    val int1 = 40 //type inference. This is of type Int
    val int2: Short = 20 //This is of type Short
    val string1 = "This is a String" //type inference
    //val string2 //uncommenting this line will throw error because variables must be initialized when the type is not declared at runtime.
    val string3: String
    string3 = "This is another String"
    //string3 = "This is yet another String" //error val cannot be reassigned. val is equivalent to 'final' keyword from java
    var string4 = "This is yet another String"
    string4 = "This is again yet another String"

    println(int1)
    println(int2)
    println(string1)
    //println(string2)
    println(string3)
    println(string4)
}