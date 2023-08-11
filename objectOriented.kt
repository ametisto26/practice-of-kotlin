// オブジェクト指向構文

class Human {
       var name = "John Doe"
       var age = 23

       protected fun intro() {
              println("我が名は${name}，齢${age}である。")
       }
}

val human = Human()
human.intro()