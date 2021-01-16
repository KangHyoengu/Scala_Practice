package study

object LearnWhileAndFor {
  /*
  *  ++나 --를 제공하지 않으므로 += 1를 사용해야 합니다.
  * 스캌라에서는 while문을 대체할 수 있는 방법이 있습니다.
  * */

  def main(args: Array[String]): Unit = {
    // 1. while문
    var i, sum = 0
    while(i < 10) {
      sum += i
      i += 1
    }
    println(s"1. $sum")

    // 2. for문
    sum = 0
    for (i <- 0 until 10) {
      sum += i
    }
    println(s"2. $sum")

    // 3. 가장 스칼라스럽게 합을 구하는 방법
    sum = (0 until 10).sum
    println(s"3. $sum")
  }
}
