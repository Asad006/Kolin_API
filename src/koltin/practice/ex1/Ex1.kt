package koltin.practice.ex1

fun main() {
    println("What is your name?");

    println("Hello, ${readUserInput()}, nice to meet you")
    val age=36

    val boardGroup = when(age){
        in 0..8 ->"family"
        in 65..200 -> "senior"
        else ->"regular"
    }
    println("you are in the $boardGroup group")
    println("you name ${hasPrefix("Asad")}")
}
fun readUserInput(): String? {
    return readLine();
}
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("As")

    else -> false
}