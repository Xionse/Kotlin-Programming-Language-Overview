fun main() {
    val number = 10

    // if statement
    if (number > 0) {
        println("$number is positive")
    } else if (number < 0) {
        println("$number is negative")
    } else {
        println("$number is zero")
    }

    // while loop
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    // for loop
    for (i in 1..10) {
        println(i)
    }
}
