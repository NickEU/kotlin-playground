package otherStuff

import java.util.Scanner

fun main() {
    val numsToPrint = Scanner(System.`in`).nextInt()
    var numsPrinted = 0
    var curNum = 1
    while (numsPrinted < numsToPrint) {
        repeat(curNum.coerceAtMost(numsToPrint - numsPrinted)) {
            print("$curNum ")
            numsPrinted++
        }
        curNum++
    }
}
