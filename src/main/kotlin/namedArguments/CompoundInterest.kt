package namedArguments

import java.lang.IllegalArgumentException
import kotlin.math.pow

fun main() {
    val param = readLine()!!
    val value = readLine()!!.toInt()
    parseUserInput(param, value)
}

fun parseUserInput(param: String, value: Int) {
    val interest = when (param) {
        "amount" -> calcCompoundInterest(amount = value)
        "percent" -> calcCompoundInterest(percent = value)
        "years" -> calcCompoundInterest(years = value)
        else -> throw IllegalArgumentException()
    }
    println(interest.toInt())
}

fun calcCompoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10): Double {
    return amount * (1 + percent / 100.0).pow(years)
}
