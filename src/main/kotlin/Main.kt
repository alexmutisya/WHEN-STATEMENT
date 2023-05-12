fun main() {
    val x = 40
    val y = 33
    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> x + y
        "-" -> x - y
        "*" -> x * y
        "/" -> x / y
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")


    val m = 2
    when (m) {
        1, 2, 3, 4 -> println("m is a positive number less than 4")
        0 -> println("m is zero")
        -1, -2, -3, -4 -> println("m is a negative number greater than 5")
    }
}












