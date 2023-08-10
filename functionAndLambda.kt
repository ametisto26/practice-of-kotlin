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


// 高階関数
fun printOne(n: Int): Unit {
       println(n)
}

val ar = arrayOf(0, 1, 1, 2, 3, 5, 8)
ar.forEach(::printOne)

ar.forEach({n: Int -> println(n)})
ar.forEach({n: -> println(n)}) //型推論
ar.forEach() {n: -> println(n)} //高階関数の最後の引数がラムダ式なら () の外にラムダ式を書ける。
ar.forEach {n: -> println(n)} //高階関数の引数が唯一かつラムダ式なら () を省略できる。
ar.forEach {println(it)} // ラムダ式の引数が唯一なら，その引数を暗黙的な引数itで受け取れる。


// return に関する注意
fun main(arg: Array<String>) {
       val arr = arrayOf(1, 2, 3, 4)
       arr.forEach {
              if(it == 3) return
              println(it)
       }
       println("Finish!")
}

fun main(arg: Array<String>) {
       val arr = arrayOf(1, 2, 3, 4)
       arr.forEach loop@ {
              if(it == 3) return@loop
              println(it)
       }
       println("Finish!")
}


fun main(arg: Array<String>) {
       val arr = arrayOf(1, 2, 3, 4)
       arr.forEach {
              if(it == 3) return@forEach
              println(it)
       }
       println("Finish!")
}


// 処理時間を計測する関数
fun benchmark(unitStr: String, func: () -> Unit): String { //unitStrは単位の文字列
       val start = System.currentTimeMillis()
       func()
       val end = System.currentTimeMillis()
       return (end - start).toString() + unitStr
}

val time = benchmark("ミリ秒") {
       var x = 0
       for (i in 1..1_000_000_000) {
              x++
       }
}

println("処理時間" + time)

