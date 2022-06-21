package string

fun main() {
    var str = "aacdlfc"
    var se = mutableSetOf<Char>()

    str.forEach {
        if (!se.contains(it)) {
            se.add(it)
        }
    }
    println(se.size)
}