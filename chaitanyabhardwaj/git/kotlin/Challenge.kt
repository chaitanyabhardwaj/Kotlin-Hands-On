package chaitanyabhardwaj.git.kotlin

fun main() {
    // 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384
    val float1 = -3847.384f
    val float2 = -3847.384.toFloat()
    println(float1 is Float)
    println(float2 is Float)

    // 2. Decalare nullable float variable
    val float3 = null
    val float4: Float? = null
    println(float3 is Float?)
    println(float4 is Float?)

    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5.
    val shortArr1 = shortArrayOf(1,2,3,4,5)
    val shortArr2 = Array<Short>(5){i -> (i + 1).toShort()}
    val shortArr3: Array<Short> = arrayOf(1,2,3,4,5)
    
    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.
    val intArrayN = Array<Int?>(40){i -> (i + 1) * 5} //note, i here is an auto-incrementing variable
    for(n in intArrayN) print("$n ")
    println()

    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'.
    val charArr1 = charArrayOf('a','b','c')
    //or
    val charArr2 = arrayOf('a','b','c').toCharArray()

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.
    val y = x?.lowercase()?:"I give up!"
    println(y)

    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result
    x?.let{ println(it.lowercase().replace("am", "am not")) }

    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toInt()
}