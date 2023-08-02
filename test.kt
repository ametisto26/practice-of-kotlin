
var n: Int = 26
var m = 22.454
var l = 6.5e23

n = 15 // Int

var a: Any
a = 51
a = "Hi!"

var b = 0b1101
var c = 0xFF

var a1 = 123_456_789
var a2 = 0x AA_F4_1D


var b1 = 1000
var b2 = 1_000
var b3 = 0x3E8
b1 == b2
b2 == b3

var l1 = 12L // Lの小文字は禁止
var l2 = 55F // Fは大文字も小文字も可能
println(l1::class)
print(l2::class)

var msg1 = "Hello.\nI am studying Kotlin."
var msg2 = """Hello.
            I am studying Kotlin."""
var msg3 = """
            Hello.
            I am studying Kotlin.""" // .trimMargin()
println(msg1)
println(msg2)
println(msg3)

var data = arrayOf(1, 2, 3)
println("配列の先頭の値は${data[0]}であり，要素数は${data.size}である。")
println("1+1 = ${1+1}.")

var nonNull: String = "AF"
var okNull: String? = "AA" // Nullable

// nonNull = okNull  Nullable 型を非Null型に代入できない。

// nonNull = null エラーになる。
okNull = null

var a0: String = "A"
var a1: String? = "A"
var b0: Any = a0
// var b1: Any = a1 Error
var b2: Any? = a1


// Nullable 型の注意
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

// ?. セーフコール演算子
var str: String? = "fd"
println(str?.length)
println(str!!.length)

var str0: String? = ""
println(str0?.length)
println(str0!!.length)

var strN: String? = null
println(strN?.length)
println(strN?.length ?:0) // ?: で規定値を設定できる。
// println(strN!!.length) Error

