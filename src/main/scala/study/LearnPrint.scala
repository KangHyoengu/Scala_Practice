package study

object LearnPrint {
  def main(args: Array[String]): Unit = {
    // 스칼라는 println, printf를 사용할 수 있습니다.

    val x = 10
    val y = 1

    // 1. println
    println("1. " + x + " is bigger than " + y)

    // 2. 문자열 앞에 s를 쓰면 $를 쓰고 변수이름을 바로 쓸수 있습니다.
    println(s"2. $x is bigger than $y")

    // 3. 수식을 쓰고 싶으면 ${ }사이에 식을 넣으면 됩니다.
    println(s"3. $x + $y = ${x + y}")

    // printf도 사용 가능합니다.
    // java.lang.*은 자동으로 import됩니다.
    // java.lang.Math도 포함입니다.
    printf("4. Pi is %f", Math.PI)
  }
}
