package array

fun main() {
    var arr = arrayOf(1, 1, 1, 1)
    var counter = 0
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[i] == arr[j]) {
                counter++
            }
        }
    }
    println(counter)
}