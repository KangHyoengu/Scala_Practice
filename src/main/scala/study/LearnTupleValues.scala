package study

object LearnTupleValues {
  // 튜플을 이용해서 한번에 여러개의 변수에 값을 넣을 수 있습니다.

  def main(args: Array[String]): Unit = {
    val (x, y, z, c, python, java) = (1, 2, 3, true, false, "no!")
    println(x, y, z, c, python, java)
  }
}
