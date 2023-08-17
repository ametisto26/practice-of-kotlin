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
