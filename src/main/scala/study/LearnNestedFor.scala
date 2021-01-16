package study

object LearnNestedFor {
  // for문 여러개의 range를 세미콜론으로 구분해서 적어주면 for문을 중첩해서 사용한것과 같은 효과입니다.

  def main(args: Array[String]): Unit = {
    for(a <- 1 to 3) {
      for(b <- 10 to 12){
        println(a, b)
      }
    }
    println()

    // 중첩된 for문 대신 아래와 같이 쓸수 있습니다.
    for(a <- 1 to 3; b <- 10 to 12) {
      println(a, b)
    }
  }
}
