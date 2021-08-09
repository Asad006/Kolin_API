package koltin.practice.Ex2

import koltin.practice.ex1.readUserInput

fun main() {
    println("What is the input string? ");
    var name :String?= readLine()

    if (name != null) {
        println(java.lang.String.format("%s has %d characters.",name,name.length))
    }
}