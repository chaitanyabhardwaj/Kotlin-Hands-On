package chaitanyabhardwaj.git.kotlin

typealias NameSet = HashSet<String>
typealias Register = HashMap<Int, String>

fun main() {
    val set = NameSet()
    set.add("Jojo")
    set.add("Tana")
    set.add("Deesse")
    set.add("Anya")
    println(set.contains("Jojo"))

    val map = Register()
    map.put(1, "Jojo");
    map.put(2, "Tana");
    map.put(3, "Deesse");
    map.put(4, "Anya");
    print(map[3]);
}