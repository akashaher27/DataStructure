package array

fun main() {
    var sent = arrayOf(
        "alice and bob love leetcode",
        "i think so too",
        "this is great thanks very much"
    )
    var arr = IntArray(sent.size)
    sent.forEachIndexed { index, s ->
        arr[index] = s.split(" ").size
    }

    for (i in arr){
        println(i)
    }
}