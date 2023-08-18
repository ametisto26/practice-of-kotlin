// 抽象クラスの継承について
abstract class Human(var name: String) {
       abstract fun intro() // 抽象メソッドを具体的に定義することはできない
}

class UnreliableHuman(name: String): Human(name) {
       override fun intro() { //サブクラスで実装を強制できる
              println("I am God.")
       }
}

val matsumoto = UnreliableHuman("松本")
matsumoto.intro()
