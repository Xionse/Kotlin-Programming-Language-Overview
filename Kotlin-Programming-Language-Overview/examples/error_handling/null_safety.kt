fun printLength(text: String?) {
    if (text != null) {
        // use the safe call operator to get the length of the string
        println("Length of '$text': ${text.length}")
    } else {
        println("Text is null")
    }
}

fun main() {
    // call the printLength function with a non-null string
    printLength("Hello, world!")

    // call the printLength function with a null string
    printLength(null)
}




// Other examples 

fun main() {
    var name: String? = "John"
    name = null

    val length = name?.length ?: -1
    println("Name length: $length")
}
