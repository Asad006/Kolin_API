package koltin.practice.Ex5

fun main() {
    print("What is the first number?")
    var num1 = readLine()
    val number1 =
    print("What is the second number?")
    var num2 = readLine()

    if (num1 != null && num2!= null) {
        println(java.lang.String.format("%s + %s = %d", num1, num2, num1.toInt() + num2.toInt()))
        println(java.lang.String.format("%s - %s = %d", num1, num2, num1.toInt() - num2.toInt()))
        println(java.lang.String.format("%s * %s = %d", num1, num2, num1.toInt() * num2.toInt()))
        println(java.lang.String.format("%s / %s = %d", num1, num2,num1.toInt() / num2.toInt()))
    }


}