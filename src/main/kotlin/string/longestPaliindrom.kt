package string

fun main() {
    var s = "addfgb"
    var srtIn = 0
    var endIn = s.length
    for (i in s.indices) {
        var t = checkPallindrom(s.subSequence(i, s.length).toString())
        t?.let {
            if (it.length > 1){
                println(it)
            }
        }
    }
}

fun checkPallindrom(s: String): String? {
    if (s.reversed() == s) {
        return s
    }
    return null
}