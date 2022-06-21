package challenge

fun main() {

    var t: String? = "hello"
    var v = t?.map {
        "l"
    }
    var m= t?.apply {
        "s"
    }

    println(v)
    println(m)
}