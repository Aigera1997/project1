import kotlin.math.pow

fun Int.toPowerWithLambda(exponent: Int, resultLambda: (Int) -> Unit) {
    val result = this.toDouble().pow(exponent).toInt()
    resultLambda(result)
}

fun main() {
    4.toPowerWithLambda(3) { result ->
        println(result)

    }
}
