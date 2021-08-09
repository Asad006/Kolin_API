package koltin.practice.ex1

fun main() {
    println("What is your name?");

    println(java.lang.String.format("Hello, %s, nice to meet you", readUserInput()))
}
fun readUserInput(): String? {
    return readLine();
}