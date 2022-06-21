package array

fun main() {
    var arr = intArrayOf(2, 3, 4, 5)
    var list = mutableListOf<Int>()
    for (i in arr.indices step 2) {
        var v = arr[i]
        for (i in 0 until arr[i + 1]) {
            list.add(v)
        }
    }
    println(list)
}