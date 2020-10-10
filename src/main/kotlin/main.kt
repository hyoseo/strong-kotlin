
data class Person(val name: String, val age: Int? = null)

// 블록본문형 함수로 했을 때는 반환 타입 지정과 리턴을 꼭 넣어줘야 했다.
fun max(a: Int, b: Int) = if (a > b) a else b

fun main(args: Array<String>) {
    val persons = listOf(Person("A"), Person("B", age=29))
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    
    println("나이가 가장 많은 사람: $oldest")
    println("더 큰 값 ${max(3, 5)}")

    val myStr = "hello!"
    println(myStr)
}