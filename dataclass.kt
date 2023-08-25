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


// componentN（分割代入）
val t1 = Triple("James", "nojob", 25)
val (name, job, age) = t1
println(name)
println(job)
println(age)

/* 内部的にはこのようになっている
val t1 = Triple("James", "nojob", 25)
val name = t1.component1()
val job = t1.component2()
val age = t1.component3()
*/


data class MemberCo(val name: String, val job: String, val age: Int)
val member1 = MemberCo("Johnson", "nojob", 25)


// copy メソッド（オブジェクトの複製）
// data class MemberCo(val name: String, val job: String, val age: Int)
// val member1 = MemberCo("Johnson", "nojob", 25)

val member2 = member1.copy(age = 47)
println(member1)
println(member2)
