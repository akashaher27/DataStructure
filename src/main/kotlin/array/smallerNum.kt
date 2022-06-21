package array

fun main() {
    var arr = intArrayOf(1, 2, 4, 5, 2)

    arr.forEachIndexed { index, i ->
        var count = 0
        for (j in arr.indices) {
            if (index != j) {
                if (arr[index] > arr[j]) {
                    count++
                }
            }
        }
        println("$i = $count")
    }
}