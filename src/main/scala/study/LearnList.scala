package study

object LearnList {
  /*
  * 리스트는 List(element1, element2, ...)와 같이 생성합니다.
  * 리스트는 값을 변경할 수 없는 속성을 가지고 있으며, 값을 추가하거나 제거하는 작업은
  * 원래의 리스트에 반영되는 것이 아니라 변경사항을 반영한 새로운 리스트를 만들어 내는 방식입니다.
  * List는 Linked list로 구현됩니다.
  * */

  def main(args: Array[String]): Unit = {
    // List[Any] (기본 리스트를 사용하므로 Immutable)
    val list = List("a", 1, true)

    // 1. 값을 읽어올 수는 있지만
    val firstItem = list(0)

    // 값을 변경할 수는 없음
    // list(0) = "b"
    println(s"1. $firstItem")

    // 2. 앞에 붙이기는 :: 또는 +: 연산자를 사용한다.
    // 리스트 두개를 붙이기는 ++ 또는 :::연산자를 사용한다.
    // 뒤에 붙이기는 :+ 연산자(immutable list에서 효율적인 방법이 아님)
    val concatenated = 0 +: (list ++ list) :+ 1000
    println(s"2. $concatenated")

    // 3. Diff
    val diffList = List(1, 2, 3, 4) diff List(2, 3)
    println(s"3. $diffList")

    // 4. 배열의 Find와 같은 방식으로 동작
    val personList = List(("솔라", 1), ("문별", 2), ("휘인", 3))
    def findByName(name:String) = personList.find(_._1 == name).getOrElse(("화사", 4))
    val findSolar = findByName("솔라")
    val findSun = findByName("태양")

    println(s"4. ${findSolar}, ${findSun}")

  }
}
