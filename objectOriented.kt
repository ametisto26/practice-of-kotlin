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

val human = Human()
human.intro()
human.age = -1
println(human.name)

