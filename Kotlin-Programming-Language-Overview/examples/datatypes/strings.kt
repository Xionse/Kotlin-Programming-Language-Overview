fun main() {
    val str1 = "Hello, World!"
    val str2 = "Kotlin"
    val str3 = "$str2 is a programming language"
    val str4 = """This is a multi-line
        |string with $str2""".trimMargin()

    println(str1)
    println(str3)
    println(str4)
}
