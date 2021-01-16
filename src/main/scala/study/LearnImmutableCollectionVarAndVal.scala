package study

import  scala.collection.mutable

object LearnImmutableCollectionVarAndVal {
  /*
  * 변경할 수 없는 Collection이 var로 선언될 경우 += 연산자나 -= 연산자를 사용할 수 있습니다.
  * 하지만 Collection은 변경할 수 없는 형태이므로 변경사항을 반영한 새로운 Collection이 만들어져 var로 변수에 저장됩니다.
  *
  * 변경할 수 있는 Collection의 경우에는 +=과 -=연산자가 메서드로 동작합니다. */

  def main(args: Array[String]): Unit = {
    // 변경할 수 없는 Collection이 var로 선언될 경우
    var immutableSet = Set(1, 2, 3)
    immutableSet += 4

    // 위의 코드는 새로운 Set을 만들어서 immutableSet에 저장하는 아래 코드와 같은
    immutableSet = immutableSet + 4
    println(s"1. $immutableSet")

    // 2. 변경할 수 있는 Collection이라면 추가하는 메서드를 호출하는 것과 같은
    val mutableSet = mutable.Set(1, 2, 3)
    mutableSet += 4

    // 위의 코드는 mutableSet 자체의 메서드를 호출하는 아래의 코드와 같은
    mutableSet.+=(4)
    println(s"2. $mutableSet")
  }
}
