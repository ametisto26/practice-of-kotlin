
var a: Int = 100
var b: Int = a
var c: Int? = a
/*
== は 同じ値であること
=== は 同じオブジェクトであること
*/
println(a == b)
println(a === b)
println(a == c)
println(a === c) // false になる原因は暗黙的な型変換にある。

//範囲演算子
val n = 26
println(n in 1..30)
println(n in 30..57)


// if 式
val p = 3.1
var msg: String = if (p < 0) {
       "p is a negative number."
} else if (p == 0.0) {
       "p = 0."
} else {
       "p is a positive number."
}
println(msg)


// when 式
val p = 3.1
var msg: String = when {
       p < 0 -> "p is a negative number."
       p == 0.0 -> "p = 0."
       else -> "p is a positive number."
}
println(msg)


val num = 5
when (num) {
       1 -> println("x = 1.")
       2 -> println("x = 2.")
       else -> { // 複数行で書くことも可能
              println("NNNNNNN.")
       }
}

val score = 80
val msg = when (score) {
       100,99,98,97,96,95 -> "Wonderful!"
       in 80..95 -> "Great!"
       in 60..79 -> "Nice!"
       !in 60.. 100 -> "Failure."
       else -> "Undefined!"
}
println(msg)

val obj: Any = "aiueo"
when (obj) {
       is String -> println("${obj.length}")
       else -> println("Type is not String")
}
