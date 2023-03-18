fun main() {
    try {
        val num1 = 10
        val num2 = 0
        val result = num1 / num2
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero!")
    } finally {  // cleanup tasks after the try-catch block has executed
        println("End of program")
    }
}
