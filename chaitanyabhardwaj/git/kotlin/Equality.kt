package chaitanyabhardwaj.git.kotlin

fun main() {
    val p1 = Person("Jojo", 1)
    val p2 = Person("Tana", 2)
    val p3 = Person("Jojo", 1)

    //double equals operator : structural equality
    //note: for structural equality to work, we have to override the equals method of the object
    println(p1 == p2)
    println(p1 == p3)

    //triple equals operator : referential equality
    println(p1 === p2)
    println(p1 === p3)
    val p4 = p3
    println(p4 === p3)

    //not equals
    println(p1 != p2)
    println(p1 != p3)
    println(p1 !== p3)
    println(p4 !== p3)
}

class Person (val name: String, val age: Int) {

    override fun equals(obj: Any?): Boolean {
        if(obj is Person) {
            return name == obj.name && age == obj.age
        }
        return false
    }

}