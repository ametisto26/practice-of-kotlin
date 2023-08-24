//Dataclass
data class MemberC(val name: String, val age: Int) // {}

data class Member(var name: String = "") {
       var age: Int = 0
}


val m1 = Member("Smith")
m1.age = 30
val m2 = Member("Smith")
m2.age = 26

// equals メソッド（==）
// プライマリコンストラクタで定義されたものを扱う
println(m1 == m2) // True


// toString メソッド（文字列化）
// プライマリコンストラクタで定義されたものを扱う
println(m1) // 暗黙的に呼び出されている




