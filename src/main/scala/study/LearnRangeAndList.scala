package study

object LearnRangeAndList {
  def main(args: Array[String]): Unit = {
    /*
    * 스칼라는 Range와 List를 생성하고 다루는 유용한 도구들을 제공합니다.
    * */

    // 1. to를 이용하면 1부터 10을 포함하는 Range를 생성합니다.
    val range1 = 1 to 10
    println(s"1. 1 to 10 ->\n\t $range1")

    // 2. until을 이용하면 마지막 숫자를 포함하지 않는 Range를 생성합니다.
    val range2 = 1 until 10
    println(s"2. 1 until 10 -> \n\t $range2")

    // 3. by를 이용하면 숫자를 건너띄는 Range를 생성합니다.
    val range3 = 1 until 10 by 3
    println(s"3. 1 until 10 by 3 ->\n\t $range3")

    // 4. toList를 통해 List로 변환합니다.
    println(s"4. range1.toList ->\n\t ${range1.toList}")

    // 5. filter: 조건에 맞는것만 모으기(4 이상인것만 모으기)
    val moreThan4 = range1.filter(_ > 4)
    println(s"5. range1.filter(_ > 4) ->\n\t $moreThan4")

    // 6. map - 각 아이템의 값을 변경하기
    val doubleIt = range1.map(_ * 2)
    println(s"6. range1.map(_ * 2) -> \n\t $doubleIt")
  }
}
