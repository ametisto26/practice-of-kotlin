// オブジェクト指向構文

class Human {
       var name = "John Doe"
       var age = 23
              set(value) { // 慣例的に変数名はvalueとする。
                     if (value < 0) {
                            println("不正な値です。")
                     } else {
                            field = value // field はバッキングフィールドのことである。
                     }
              }

       fun intro() {
              println("我が名は${name}，齢${age}である。")
       }
}

//プライマリコンストラクタ
class Human constructor(name: String, age: Int) {
       var name: String
       var age: Int

       init { // プロパティを設定する
              this.name = name
              this.age = age
       }

       fun intro() {
              println("我が名は${name}，齢${age}である。")
       }
}

//プライマリコンストラクタがアノテーションやアクセス修飾子を持たない場合は，以下のように省略可能である。
// class Human(name: String, age: Int){  }


//プライマリコンストラクタの引数にvar / val をつけることで
//プロパティの宣言と初期化を同時に行うこともできる。
class Human (var name: String, var age: Int) {
       fun intro() {
              println("我が名は${name}，齢${age}である。")
       }
}

//アクセス修飾子を付与できる
class Human (public var name: String, internal var age: Int) {
       fun intro() {
              println("我が名は${name}，齢${age}である。")
       }
}


//セカンダリコンストラクタを利用する場合
class Human (var name: String, var age: Int) {
       constructor(name: String):this(name, 10) {} //1つめ
       constructor():this("太郎") {} //2つめ
       fun intro() {
              println("我が名は${name}，齢${age}である。")
       }
}

val human1 = Human("J.", 6)
val human2 = Human("K.")
val human3 = Human()


//引数の既定値を設定する場合
class Human (var name: String = "二郎", var age: Int = 10) {
       fun intro() {
              println("我が名は${name}，齢${age}である。")
       }
}


val human = Human()
human.intro()
human.age = -1
println(human.name)

