package koltin.practice.Ex6

fun main() {
    println("What is your current age?")
    var age = readLine()
    println("At what age would you like to retire?")
    var retirmentAge = readLine()

    if (retirmentAge != null && age != null) {

        println(
            java.lang.String.format(
                "You have %d years left until you can retire.",
                retirmentAge.toInt() - age.toInt()
            )
        )

        println(
            java.lang.String.format(
                "It's 2021, so you can retire in %d.",
                2021 + retirmentAge.toInt() - age.toInt()
            )
        )
    }
}