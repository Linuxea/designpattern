package builder

fun main() {

    val clothes = Clothes.Builder(10, "green")
        .money(100.toDouble())
        .build()
    println(clothes)

}