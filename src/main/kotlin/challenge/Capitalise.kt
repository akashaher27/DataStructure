package challenge

import java.lang.StringBuilder
import java.util.*

fun main(str: Array<String>) {

    var scn = Scanner(System.`in`)
    println("enter a string")
    var str = scn.nextLine()
    capitalise(str)
}

fun capitalise(str: String) {
    var list = str.split(Regex(" "))
    var sb = StringBuilder()
    for (i in list) {
        sb
            .append(i.replaceFirstChar {
            it.uppercaseChar()
        })
            .append(" ")
    }
    println(sb.toString())
}