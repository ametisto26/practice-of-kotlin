fun getTriangleArea(width: Double, height: Double): Double {
       return width * height * 0.5
}
println(getTriangleArea(2.5, 1.25))

fun getTriangleArea(width: Double, height: Double) = width * height * 0.5 // 短く書くことができる場合

println(getTriangleArea(2.5, 1.25))

fun neko(name: String): Unit {
       println("Meow, ${name}!")
}
neko("John")

fun hello(name: String) { // Unit は省略可能
       println("Hello, ${name}!")
}
hello("John")



// 引数のデフォルト値
fun getTriangleArea(width: Double = 1.0, height: Double = 2.0): Double {
       return width * height * 0.5
}
println(getTriangleArea())
println(getTriangleArea(2.5))
println(getTriangleArea(height = 2.5)) //名前付き引数
// println(getTriangleArea(width = 2.5, 2.5)) エラー

// 引数のデフォルト値
fun getTriangleArea(width: Double = 1.0, height: Double): Double {
       return width * height * 0.5
}
// println(getTriangleArea(2.5))　 エラーになる。
//必須引数を前方に，任意引数を後方にすると良い。

