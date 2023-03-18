fun main() {
    var name: String? = "John"
    name = null

    val length = name?.length ?: -1
    println("Name length: $length")
}
