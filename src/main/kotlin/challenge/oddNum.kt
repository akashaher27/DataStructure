package challenge

import java.util.*

fun main(str: Array<String>) {

    var scn = Scanner(System.`in`)
    println("Enter numbers")
    while (true){
        var v = scn.next().toInt()
        if (oddNum(v)){
            println(v)
        }
    }

}

fun oddNum(i: Int): Boolean {
    return i.rem(2) != 0
}