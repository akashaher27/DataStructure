package array

fun main() {
    var arr = arrayOf(1, 1, 2, 2, 3, 4, 5, 5, 5)

    var map = mutableMapOf<Int, Int>()
    for (i in arr) {
        if (map.containsKey(i)) {
            val v = map[i] ?: 1
            map[i] = v + 1
        } else {
            map[i] = 1
        }
    }

    for ((i, j) in map.entries) {
        if (j > 1) {
            println("${i} =${j}")
        }
    }
}