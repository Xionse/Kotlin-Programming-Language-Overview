fun main() {
    // function without parameters or return value
    fun sayHello() {
        println("Hello, World!")
    }

    // function with parameters and return value
    fun square(n: Int): Int {
        return n * n
    }

    // function with function type parameter
    fun applyFunction(n: Int, f: (Int) -> Int): Int {
        return f(n)
    }

    // lambda expression
    val double = { n: Int -> n * 2 }

    // function reference
    fun triple(n: Int): Int {
        return n * 3
    }

    // call functions
    sayHello()
    println(square(5))
    println(applyFunction(5, double))
    println(applyFunction(5, ::triple))
}
