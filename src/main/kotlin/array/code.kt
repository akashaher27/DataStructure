package array

fun main() {

    var str = "silant"
    var str2 = "listen"

    var map1 = mutableMapOf<Int, String>()

    str.forEachIndexed { index, c ->
        map1.put(index, c.toString())
    }

    println(checkAnagram(map1, str2))

}

fun checkAnagram(map: MutableMap<Int, String>, str2: String): Boolean {
    if (str2.length == map.size) {
        str2.forEach {
            if (map.containsValue(it.toString())) {

            } else {
                return false
            }
        }
    }
    return true
}