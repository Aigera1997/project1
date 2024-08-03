import kotlin.math.pow

fun Int.pow(index: Int): Int {
    return this.toDouble().pow(index).toInt()
}

fun main() {
    val number = 4
    val index = 4
    val result = number.pow(index)
    println("$number^$index = $result")
}
