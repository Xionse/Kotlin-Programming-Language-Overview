fun main() {
    val a = 5
    val b = 3

    // arithmetic operators
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    val remainder = a % b

    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Quotient: $quotient")
    println("Remainder: $remainder")

    // comparison operators
    val isGreaterThan = a > b
    val isLessThan = a < b
    val isEqualTo = a == b
    val isNotEqualTo = a != b

    println("Is $a greater than $b? $isGreaterThan")
    println("Is $a less than $b? $isLessThan")
    println("Is $a equal to $b? $isEqualTo")
    println("Is $a not equal to $b? $isNotEqualTo")

    // logical operators
    val x = true
    val y = false

    val andResult = x && y
    val orResult = x || y
    val notResult = !x

    println("x && y = $andResult")
    println("x || y = $orResult")
    println("!x = $notResult")
}
