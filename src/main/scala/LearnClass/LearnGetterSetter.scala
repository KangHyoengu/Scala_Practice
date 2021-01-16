package LearnClass

object LearnGetterSetter {
  /*
  * 자바와 달리 스칼라에서는 변수와 메서드는 같은 이름을 사용할 수 없습니다.
  * 그래서 JPerson.scala에서 필드의 이름은 _name으로, setter는 name_으로, getter는 name으로 정의하고 있습니다. */

  def main(args: Array[String]): Unit = {
    val jp = new JPerson("자바 스타일")
    val sp = new SPerson("스칼라 스타일")

    println(jp.name)
    println(sp.name)

    jp.name += " 싫어요!"
    sp.name += " 좋아요!"

    println(jp.getName)
    println(sp.getName)
  }
}
