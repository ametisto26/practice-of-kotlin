
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

val ar = arrayOf(2, 3, 6)
for (elem in ar) {
       println(elem)
}

val ma = mapOf("First" to 1, "Second" to 2, "Third" to 3)
for ((key, value) in ma) {
       println("${key}:${value}")
}

val lst = listOf("a", "i", "u")
for ((i, v) in lst.withIndex()) {
       println("${i}:${v}")
}

for (i in 1..5) {
       println(i)
}

for (i in 1 until 5) {
       println(i)
}


for (i in 5 downTo 1) {
       println(i)
}

for (i in 1..50 step 6) {
       println(i)
}


for (i in 1..50) {
       if (i % 2 == 0) continue
       println(i)
       if (i == 47) break
}


for (i in 1..5) {
       for (j in 1..5) {
              if (i * j > 7) break
              print("${i * j}")
       }
       println()
}


outer@ for (i in 1..5) {
       for (j in 1..5) {
              if (i * j > 7) break@outer
              print("${i * j}")
       }
       println()
}


var i = 1
while (i < 4) {
       println(i)
       i ++
}

var j = 1
do {
       println(j)
       j ++
} while (j < 4) // 出力は 1 2 3 


var j = 4
do {
       println(j)
       j ++
} while (j < 4) // 出力は 4


/* 例
do {input password} while (check password)
 */
