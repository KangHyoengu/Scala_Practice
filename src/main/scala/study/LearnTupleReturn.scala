package study

object LearnTupleReturn {
  // 튜플을 이용해서 한 번에 여러개의 값을 리턴할 수 있습니다.

  def swap(x:String, y:String): (String, String) = (y , x)

  def main(args: Array[String]): Unit = {
    val (a, b) = swap("hello", "world")
    println(a, b)
  }
}
