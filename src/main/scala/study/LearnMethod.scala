package study

object LearnMethod {
  /*
    * 스칼라에서 메소드는 다양한 형태로 정의할 수 있습니다.
    * 리턴값이 있는 메소드는 메소드를 정의하는 블록{} 전에 =을 적어주어야 합니다.
    * 리턴 키워드는 옵션이며, 적어주지 않으면 리턴타입은 리턴값에 의해 결정됩니다.
    * */

  // 1. 일반적인 메서드
  def add(x:Int, y:Int):Int = {
    return x + y
  }

  // 2. return 을 생략한 메서드
  def addWithoutReturn(x:Int, y:Int) = { // x + y는 int 이므로 return 타입은 Int로 결정됩니다.
    x + y // return을 적어주지 않아도 마지막 값이 return 값 입니다.
  }

  // 3. 메서드가 한줄일 경우 중괄호를 생략해도 됩니다.
  def addWithoutBlock(x:Int, y:Int) = x + y

  def main(args: Array[String]): Unit = {
    println(s"1. ${add(1, 2)}")
    println(s"2. ${addWithoutReturn(3, 4)}")
    println(s"3. ${addWithoutBlock(5, 6)}")
  }
}
