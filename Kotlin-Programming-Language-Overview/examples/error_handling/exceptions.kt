fun divide(x: Int, y: Int): Int {
    try {
        // attempt to divide x by y
        return x / y
    } catch (e: ArithmeticException) {
        // handle division by zero or other arithmetic errors
        println("Error: ${e.message}")
        return 0
    } finally {
        // code to be executed regardless of whether an exception occurred or not
        println("Division operation complete.")
    }
}

fun main() {
    // call the divide function with arguments
    val result = divide(10, 2)
    println("Result: $result")
}
