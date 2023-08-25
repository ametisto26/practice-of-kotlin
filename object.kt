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


