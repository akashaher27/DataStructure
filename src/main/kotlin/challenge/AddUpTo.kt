package challenge

import java.util.*

fun main(str: Array<String>) {
    val scn = Scanner(System.`in`)

    while (true) {
        println("Enter a num")
        var v = scn.next().toInt()
        sum(v)
    }
}

fun sum(n: Int) {
    var v: Int =  0
    for (i in 1..n){
        v += i
    }
    println(v)
}