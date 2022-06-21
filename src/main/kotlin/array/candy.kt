package array

fun main() {

    var array = intArrayOf(1, 2, 3, 4)
    var exCandy = 2

    var arraB = BooleanArray(array.size)

    var temp = array[0]
    for (i in array.indices) {
        if (temp < array[i]) {
            temp = array[i]
        }
    }

    for (i in array.indices) {
        arraB[i] = temp <= array[i] + exCandy
    }

    println(arraB.contentToString())
}