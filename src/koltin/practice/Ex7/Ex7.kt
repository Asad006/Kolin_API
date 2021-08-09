package koltin.practice.Ex7

fun main() {
    println("What is the length of the room in feet?")
    var length = readLine()
    println("What is the width of the room in feet?")
    var width = readLine()

    println(
        java.lang.String.format(
            "You entered dimensions of %s feet by %s feet.%nThe area is %d%n%.3f", length, width, areaFunction(length, width),
            areaFunction(length,width)*0.09290304
        )
    )
}

fun areaFunction(length: String?, width: String?): Int {
    var area: Int = 0
    if (width != null && length != null) {
        area = length.toInt() * width.toInt()
    }
    return area
}
