package array

fun main() {
    var arr1 = intArrayOf(1, 2, 3, 4, 5)
    var arr2 = IntArray(arr1.size)
    arr1.forEachIndexed { index, i ->
        var sum = 0
        for (i in index downTo 0) {
            sum += arr1[i]
        }
        arr2[index] = sum
    }
    arr2.forEach {
        println(it)
    }
}