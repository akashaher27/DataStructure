package challenge

fun main() {
    val str = "Hello world hi"

    var v = str.split(" ")

    for (i in v.size - 1 downTo 0) {
        println(v[i])
    }

}