// オブジェクト式
// 再利用を目的としないクラスの定義
// object {クラス本体}
// object: 基底クラス or interface {クラス本体}

// btn.setOnClickListener(object: View.OnClickListener {
//        override fun onClick(view: View) {
//               // "処理"
//        }
// })

// ラムダ式で書くことができる
// btn.setOnClickListener({ view: View -> "処理" } )

// もっと省略すると
// btn.setOnClickListener { "処理" }


// オブジェクト宣言
/*
object オブジェクト名 {オブジェクト本体}
*/

object TanakaTaro {
       val name = "Tanaka Taro"
       val clothe = "T-shirt"

       fun intro() {
              println("${name}は${clothe}を着ている。")
       }
}

TanakaTaro.clothe = " "
TanakaTaro.intro()
// 既存のクラスの継承も可能である。基底クラスのコンストラクタに値を渡せば良い。
// object AAA: Foo("Foo") {}



// コンパニオンオブジェクト
class MyClass {
       companion object Factory { //クラス内部のオブジェクト宣言のようなもの
              fun create(): MyClass = MyClass()
       }
}

val myc = MyClass.create()
println(myc::class) // class MyClass

// コンパニオンオブジェクト
// class MyClass {
//        companion object { // 登場しないので省略可能
//               fun create(): MyClass = MyClass()
//        }
// }

// コンパイル時定数
const val date = 1


class genericExample<T>(var value: T) {
       fun getProp(): T {
              return value
       }
}

class genericExample2<T, T2>(var value: T, var value2: T2) {
       fun getProp(): T {
              return value
       }
}

val g1 =genericExample<String>("foo")
val g2 =genericExample<Int>(26)
val g3 =genericExample("neko") // 型推論できるなら省略可能
val g4 =genericExample2<String, Int>("s", 5)

println(g1.getProp())
println(g2.getProp())
g1.value = 5 // エラー


fun <T> tail(arr: Array<T>): T = arr[arr.size - 1]

val aaa = arrayOf(1, 2, 6)

println(tail<Int>(aaa))
println(tail(aaa)) // 型推論できるなら省略可能



//ネストクラス
//クラスの中にクラスを定義できる

class Outer(val name: String = "Outer") {
       inner class Nested(val name: String = "Nested") {
              fun show() = {
                     println("${this@Outer.name} called show()")
                     println("${name} is running")
              }
       }

       fun run(){
              val nested = Nested()
              nested.show()
       }
}

val o = Outer()
o.run()


