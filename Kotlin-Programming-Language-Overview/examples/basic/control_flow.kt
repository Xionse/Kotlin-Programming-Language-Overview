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






// alternatively 


fun main() {
    val num = 5

    // if-else statement to determine if a number is odd or even
    if (num % 2 == 0) {
        println("$num is even")
    } else {
        println("$num is odd")
    }

    // when statement to determine the type of a variable
    val x: Any = "Hello"
    when (x) {
        is Int -> println("$x is an integer")
        is String -> println("$x is a string")
        else -> println("$x is not an integer or a string")
    }

    // for loop to iterate over a range of numbers
    for (i in 1..5) {
        println(i)
    }

    // while loop to repeat a block of code until a condition is met
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }
}
