package study

object LearnScala {
  def main(args: Array[String]): Unit = {
    /*
    * 1과 같은 원시타입은 객체로 취급됩니다.
    * 그래서 +와 같은 연산자는 사실 1이라는 원시타입 객제의 메소드입니다.
    *
    * 스칼라의 원시타입은 스칼라에서 객체로 취급되지만, 컴파일 이후에는 성능을 위해 자바의 원시타입을 이용합니다.
    * */

    println( 1 + 2 )
    //println((1).+(2))
  }
}
