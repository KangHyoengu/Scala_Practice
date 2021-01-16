package study

object LearnAnonymous {
  /*
  * 익명함수는 [(매개변수명: 매개변수타입 ... ) => 실행코드]와 같은 형태로 정의합니다.
  * 익염함수는 매개변수와 리턴타입이 같은 타입의 익명함수만 받아들입니다.
  * */

  // 매개변수로 받은 익명함수에 1과 2를 널어서 실행하는 메서드
  def doWithOneAndTwo(f: (Int, Int) => Int) ={
    f(4, 2) // return은 생략되었지만 f(1, 2)의 결과가 return
  }

  def main(args: Array[String]): Unit = {
    // 1. 명시적으로 타입을 선언하는 익명함수
    val call1 = doWithOneAndTwo((x:Int, y:Int) => x + y)

    // 2. 코드 10번째 줄에서 익명함수의 매개변수 타입(Int, Int)를 이미 정했기 때문에 생략
    val call2 = doWithOneAndTwo((x, y) => x * y)

    // 3. 이렇게 요약할 수도 있음
    val call3 = doWithOneAndTwo(_ / _) // 매개변수의 순서대로 _에 대입됨

    println(call1, call2, call3)
  }
}
