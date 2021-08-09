package koltin.practice.Ex3

fun main() {
    println("What is the quote?")
    val name = readLine()
    println("Who said it?")
    var respo = readLine()
    println(java.lang.String.format("%s,says \" %s\" ",respo,name))
}