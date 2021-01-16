package study

object LearnIf {
  /*
  * 조건문 Java나 C와 거의 같습니다.
  * 스칼라에서 중요한 차이점은 if문도 수식이라는 점입니다.
  * */

  def main(args: Array[String]): Unit = {
    if(true)
      println("한 줄은 {괄호}를 생략할 수 있습니다.")

    if(1 + 1 == 2) {
      println("여러 줄은")
      println("{괄호}가 필요합니다.")
    } else {
      println("컴퓨터가 고장났나봐요.")
    }

    val likeEggs = false

    // 삼항 연산자대신 이렇게 쓸 수 있습니다.
    val breakfast = if(likeEggs) "계란후라이" else "사과"

    println(s"아침으로 ${breakfast}를 먹어요")
  }
}
