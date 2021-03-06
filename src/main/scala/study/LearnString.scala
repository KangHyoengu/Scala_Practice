package study

object LearnString {
  def main(args: Array[String]): Unit = {
    // 1. 문자열 뒤집기
    val reverse = "Scala".reverse
    println(s"1. $reverse")

    // 2. 첫글자르 대문자로
    val cap = "scala".capitalize
    println(s"2. $cap")

    // 3. 7번 반복
    val multi = "Scala " * 7
    println(s"3. $multi")

    // 4. 문자열을 정수로 변환
    val int = "123".toInt
    println(s"4. $int")
  }
}
