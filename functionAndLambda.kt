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


// 引数のデフォルト値に関する注意
fun getTriangleArea(width: Double = 1.0, height: Double): Double {
       return width * height * 0.5
}
// println(getTriangleArea(2.5))　 エラーになる。
//必須引数を前方に，任意引数を後方にすると良い。


//可変長引数
fun sum(vararg values: Int): Int {
       var result = 0
       for (value in values) {
              result += value
       }
       return result
}
println(sum(2, 7, 5, 3))

val arr = intArrayOf(6, 4, 5, 3, 2)

println(sum(*arr)) // sum(arr) はエラー
println(sum(7, *arr, 113))



//複数の戻り値
fun getSumAverage(vararg values: Int): Pair<Int, Double> {
       var result = 0
       var count = 0.0
       for (value in values) {
              result += value
              count ++
       }
       return Pair(result, result / count)
}

println(getSumAverage(*arr))

fun main(args: Array<String>) {
       val (s, a) = getSumAverage(2, 5, 7, 3)
       println(s)
       print(a)
}

val (sum, _) = getSumAverage(2, 5, 7, 3) // _ 第2成分は使用しない

