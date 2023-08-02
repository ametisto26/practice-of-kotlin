
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



