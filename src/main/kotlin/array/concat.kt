package array

fun main() {

    var arr1 = intArrayOf(1, 2, 3, 4)
    var arr2 = IntArray(arr1.size * 2)

    for (i in arr1.indices) {
        arr2[i] = arr1[i]
        arr2[arr1.size + i] = arr1[i]
    }

    arr2.forEach {
        println(it)
    }
}