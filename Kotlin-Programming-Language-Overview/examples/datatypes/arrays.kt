fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val names = arrayOf("John", "Mary", "Bob")
    val mixed = arrayOf(1, "Hello", true)

    println("Numbers: ${numbers.joinToString()}")
    println("Names: ${names.joinToString()}")
    println("Mixed: ${mixed.joinToString()}")
}
