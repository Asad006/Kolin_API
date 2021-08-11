package koltin.practice.Ex6

fun main() {
    println("What is your current age?")
    var age = readLine()
    println("At what age would you like to retire?")
    var retirmentAge = readLine()

    if (retirmentAge != null && age != null) {

        println(
            "You have ${retirmentAge.toInt() - age.toInt()} years left until you can retire."
        )

        println(
            "It's 2021, so you can retire in ${2021 + retirmentAge.toInt() - age.toInt()}.")
    }
}