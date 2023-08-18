// 継承可能なクラスについて
open class Human(var name: String) { //継承可能な元のクラスには open をつける。
       open fun intro() { //override可能なメソッドに open をつける。
              println("我が名は${this.name}。")
       }
}

class PerfectHuman(name: String, var place: String): Human(name) {
       override fun intro() {
              println("${this.name}! ${this.name}!")
              super.intro()
       }
       fun liveIn() {
              println("We live in ${this.place}")
       }
}

val joji = PerfectHuman("Nakata", "Tokio")
joji.liveIn()
joji.intro()


// クラスは単一継承のみ
// インターフェースの実装（継承と同じ感覚で良い）
interface Hoge1 { 
       fun hoge1() // デフォルトで抽象クラス（実装を強制できる）
}
interface Hoge2 {
       fun hoge2()
}
interface Hoge3 {
       fun hoge3()
}

class HogeA: Hoge1, Hoge2 {
       override fun hoge1() {}
       override fun hoge2() {}
}
class HogeB: Hoge2, Hoge3 {
       override fun hoge2() {}
       override fun hoge3() {}
}

//インターフェースのメソッドはデフォルトを設定できる。
//インターフェースのメソッドがデフォルトの実装を持つ場合，オーバーライドは強制されない。
interface MyInterface {
       fun bar()
       fun foo() = println("Foo!")
}

class Bar: MyInterface {
       override fun bar() = println("Bar!")
}


//　同名のメソッドの場合
interface HogeX {
       fun hoge() = println("X")
}
interface HogeY {
       fun hoge() = println("Y")
}

class HogeXY: HogeX, HogeY {
       override fun hoge() {
              super<HogeX>.hoge()
              super<HogeY>.hoge()
       }
}


// インターフェース中にプロパティを定義できる
interface FooInterface {
       var foo: String
       fun foo() = println(foo)
}

class Foo: FooInterface {
       override var foo = "FOO"
}

val a = Foo()
a.foo() // FOO と出力される


//バッキングフィールドを持てないことへの対処
fun main(){
       val price = Price()
       price.checkPrice()
}

interface MyInterface {
       var price: Int
       val taxIncluded: Int
              get() = (this.price * 1.1).toInt()
       fun checkPrice() {
              println("税込み${taxIncluded}円です。")
       }
}

class Price: MyInterface {
       override var price = 200
}


//継承・実装間の型変換
open class Person {}
class BusinessPerson: Person() {
       fun work() = println("Working.")
}

val p: Person = BusinessPerson() //upcasting 派生クラス＝＞基底クラス
if (p is BusinessPerson) { //downcasting　派生クラス＜＝基底クラス
       p.work()  //ここではもうBusinessPerson型として扱われる（スマートキャスト）。
}

