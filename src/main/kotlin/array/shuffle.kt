package array

fun main() {
    var arr = intArrayOf(1, 2, 3, 1, 2, 3)
    var arr1 = IntArray(arr.size)
    var n = 3

    for (i in 0 until n) {//0,1,2
        var j = i + i  //0,2,4
        arr1[j] = arr[i]
    }

    for (j in n until arr.size){//3,4,5
        arr1[j - 2] = arr[j] //1,3,5
    }
}