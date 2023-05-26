package chaitanyabhardwaj.git.kotlin

fun main() {
    val a = 10 //Int by default
    var b = 20L //convert to Long

    /* this will throw error : type mismatch.
    *  in kotlin, since data types are classes,
    *  we cannot directly assign or implicitly typecast types
    */
    //b = a //uncomment if you don't beleive me
    b = a.toLong() // this is the right approach to type cast

    println(a is Int)
    println(b is Long)
    println(b)

    val d = 2.5 // Double by default
    println(d is Double)
    val f = 2.5f // converted to Float
    println(f is Float)
    
    val bo = true // Boolean by default
    println(bo is Boolean)

    val c = 'a' //Char by default
    println(c is Char)

    //Any data type
    //Any is the super type of all data types
    //Hence Any can be anything
    var flex: Any
    flex = a
    println(flex)
    println(flex is Any)
    flex = b
    println(flex)
    println(flex is Any)
    flex = d
    println(flex)
    println(flex is Any)
    flex = f
    println(flex)
    println(flex is Any)

    //Other datatypes in Kotlin are
    //'Unit' this is used as a replacement of 'void' keyword from Java
    //'Nothing' this is nothing. This is all we know.
}