package study

object LearnAnonymous2 {
  // 익명함수를 정의하는 다른 방식들

  // 1. 메서드를 정의하는 방식
  def add1(x:Int, y:Int) = x + y

  // 2. 익명함수
  val add2 = (x:Int, y:Int) => x + y

  // 3.익명함수를 정의하는 다른 방식
  val add3:(Int, Int) => Int = _ + _

  // 4. 익명함수를 정의하는 또다르 방식(잘 사용 안함)
  val add4 = (_ + _):(Int, Int) => Int

  def main(args: Array[String]): Unit = {
    // 모두 두 숫자를 더해주는 역할을 하므로 같은 결과를 출력한다.
    println(s"1. ${add1(10, 20)}")
    println(s"2. ${add2(10, 20)}")
    println(s"3. ${add3(10, 20)}")
    println(s"4. ${add4(10, 20)}")
  }
}
