package chaitanyabhardwaj.git.kotlin

fun main() {
    val name = "Chaitanya"
    val age = 24
    val num = 4

    val _1 = "sea"
    val _2 = "Billy O' Tea"
    val _3 = "Bow"
    val _4 = "bully boys"
    
    //Textblocks
    val str = """
    |There once was a ship that put to $_1
    |The name of the ship was the $_2
    |The winds blew hard dipped down her $_3
    |Blow my $_4 blow
    """.trimMargin()

    println("Hello my name is $name and I'm $age years old.")
    println("$age + $num = ${age + num}")
    print(str)
}