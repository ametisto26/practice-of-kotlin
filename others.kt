// 拡張関数
fun String.repeat(n: Int): String {
       var builder = StringBuilder()
       for (i in 1..n) {
              builder.append(this)
       }
       return builder.toString()
}

val hoge = "HOGE"
println(hoge.repeat(6))


// 演算子のオーバーロード
fun show() = println("OK")
fun show(value: String) = println(value)

show()
show("Good")

//引数にデフォルト値を設定できるので，演算子以外にオーバーロードは基本的に利用しない。
// fun show(value: String = "OK") = println(value)


class Coordinate(val x: Double, val y: Double) {
       operator fun plus(c: Coordinate): Coordinate { // 演算子のメソッドであることを明示
              return Coordinate(this.x + c.x, this.y + c.y)
       }
}

val c0 = Coordinate(0.0, 0.0)
val c1 = Coordinate(1.0, 2.0)
val c2 = Coordinate(0.5, 2.0)
val c3 = c1 + c2
println("Coordinate:(${c3.x}, ${c3.y})")

