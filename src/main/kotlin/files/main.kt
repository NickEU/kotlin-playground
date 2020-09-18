package files

import java.io.File

fun main() {
    findLongestWord()
    countWords()
}

fun findLongestWord() {
    val fileName = "words_sequence.txt"
    val file = File(fileName)
    println(file.absolutePath)
    println(file.length())
    var maxLen = 0
    file.forEachLine { maxLen = maxLen.coerceAtLeast(it.length) }
    println(maxLen)
}

fun countWords() {
    File("text.txt")
        .readLines()
        .map { it.split(" ").size }
        .sum()
        .let { println(it) }
}
