//型変換
// var a: Float = 1.2
// var b: Double = 12

var a: Float = 1.2f
var b: Double = 12.0

var bL: Long = b.toLong()


//配列
var arr1 = ArrayOf(1, 2, 3, 4, 5)
var arr2 = intArrayOf(1, 2, 3) // 要素の型をIntとして設定
var arr3: Array<String?> = arrayOfNulls(5) //　要素がすべて空（Null）の配列を生成できる。
var arr4 = Array(3, {i -> i * 2}) // ラムダ式を用いる方法


//コレクション（読み取り専用）
var lst = listOf("a", "b", "c")
var set = setOf("A", "B", "C", "AA", "BB", "CC", "BB")
var map = mapOf("FISRT" to 1, "SECOND" to 2, "THIRD" to 3) // 他言語ではディクショナリと呼ばれることもある。

println(lst)
println(set)
println(map)


//コレクション（変更可能）
var mlst = mutableListOf("a", "b", "c")
var mset = mutableSetOf("A", "B", "C", "AA", "BB", "CC", "BB")
var mmap = mutableMapOf("FISRT" to 1, "SECOND" to 2, "THIRD" to 3) 

println(mlst)
println(mset)
println(mmap)

//リストが変更可能になる例
var mlst2 = mlst // List<型> で型を指定できる。
mlst2[1] = "changed"
println(mlst2)


//定数（再代入の禁止）
val cons = 8128
// cons = 5 Error

//配列の場合の振る舞い
val conA = arrayOf(1, 2, 3)
// conA = arrayOf(0, 1, 2) Error
conA[0] = 6

