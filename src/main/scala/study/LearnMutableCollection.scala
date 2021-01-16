package study

import scala.collection.mutable

object LearnMutableCollection {
  /*
  * 스카라는 변경할 수 없는 collection을 사용하는것을 권장합니다.
  * 필요한 경우 변경할 수 있는 collection을 사용할 수 있습니다.
  *
  * ArrayBuffer는 자바에서 배열로 구현되는 java.lang.ArrayList와 유사합니다.
  * ListBuffer는 :List처럼 Linked list로 구현됩니다.
  * mutable Collaction을 사용할 때는 앞에 mutable을 붙여서 사용해 주세요 */

  def main(args: Array[String]): Unit = {
    // 1. 배열로 구현되는 ArrayBuffer
    val arrayBuffer = mutable.ArrayBuffer(1, 2, 3)
    arrayBuffer += 4
    arrayBuffer -= 1
    arrayBuffer ++= List(5, 6, 7)
    println(s"1. $arrayBuffer")

    // 2. Linked list로 구현되는 ListBuffer
    val listBuffer = mutable.ListBuffer("a", "b", "c")
    println(s"2. $listBuffer")

    // 3. Mutable Set
    val hashSet = mutable.Set(0.1, 0.2, 0.3)
    hashSet ++= mutable.Set(5)
    println(s"3. $hashSet")

    // 4. Mutable Map
    val hashMap = mutable.Map("one" -> 1, "two" -> 2)
    hashMap ++= Map("five" -> 5, "six" -> 6)
    println(s"4. $hashMap")
  }
}
