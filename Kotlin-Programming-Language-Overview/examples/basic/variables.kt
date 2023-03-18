fun main() {
    // variable declaration with type
    val name: String = "John"
    val age: Int = 25

    // variable declaration with type inference
    val height = 1.75
    val weight = 80

    // variable declaration with no initial value 
    // lateinit is a modifier in Kotlin that can be applied to a non-null property of a class, indicating that the property will be initialized later, before it is used
    // Using lateinit allows you to declare a property without having to initialize it immediately with a value, 
    // and can be useful in cases where the initialization value is not available at the time the property is declared.
    lateinit var email: String

    // assign value to variable
    email = "dr.nasser@example.com"

    // string interpolation
    println("$name is $age years old, $height meters tall,and weighs $weight kg.")
}


`types.kt`:
```kotlin
fun main() {
    // numbers
    val byteNum: Byte = 127
    val shortNum: Short = 32767
    val intNum: Int = 2147483647
    val longNum: Long = 9223372036854775807L
    val floatNum: Float = 3.14159f
    val doubleNum: Double = 3.141592653589793

    // characters
    val char1: Char = 'a'
    val char2: Char = '\u0041'

    // booleans
    val trueValue: Boolean = true
    val falseValue: Boolean = false

    // arrays
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val names = arrayOf("John", "Mary", "Bob")
    val mixed = arrayOf(1, "Hello", true)

    // strings and string templates
    val str1 = "Hello, World!"
    val str2 = "Kotlin"
    val str3 = "$str2 is a programming language"
    val str4 = """This is a multi-line
        |string with $str2""".trimMargin()

    // print values
    println(byteNum)
    println(shortNum)
    println(intNum)
    println(longNum)
    println(floatNum)
    println(doubleNum)
    println(char1)
    println(char2)
    println(trueValue)
    println(falseValue)
    println(numbers.joinToString())
    println(names.joinToString())
    println(mixed.joinToString())
    println(str1)
    println(str3)
    println(str4)
}

