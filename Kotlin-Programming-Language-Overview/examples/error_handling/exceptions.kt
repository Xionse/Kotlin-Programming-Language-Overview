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



/* OTHER TYPES OF EXCEPTIONS */


// Arithmetic Exceptions 

try {
    // arithmetic operation
} catch (e: ArithmeticException) {
    // handle the exception
}

// Nullpoointer Exceptions 

val nullableString: String? = null
val length = nullableString?.length ?: 0






// Index OutofBounds 

val array = arrayOf(1, 2, 3)
try {
    val element = array[5]
} catch (e: IndexOutOfBoundsException) {
    // handle the exception
}

val index = 5
if (index in 0 until array.size) {
    val element = array[index]
} else {
    // handle the exception
}




//IOException 

val file = File("path/to/file")
try {
    file.readText()
} catch (e: IOException) {
    // handle the exception
}

