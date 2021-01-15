package study

object LearnVariable {
  def main(args: Array[String]): Unit = {
    /*
    * 변수는 var로 상수는 val로 선언합니다.
    * 한번에 여러개의 변수를 선언하고 값을 대입할 수 있습니다.
    * */

    var x = 1 + 2
    x = 3 * 4
    println("x = "+x)

    val y = 1 + 2
    //y = 3 * 4 // 이 줄은 상수에 값을 대입해서 에러가 나기 때문에 지워야 합니다.
    println("y = " + y)

    // 한 번에 여러개의 변수를 선언하면서 값을 대입할 수 있습니다.
    var a, b, c = 5
    println("a = " + a)
    println("b = " + b)
    println("c = " + c)
  }
}
