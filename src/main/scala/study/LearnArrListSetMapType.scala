package study

object LearnArrListSetMapType {
  /*
  * Array, List, Set, Map의 구성요소는 어떤 타입이든 사용할 수 있지만
  * 최종 타입은 공통으로 상속받는 타입중 최상위 타입으로 결정됩니다*/

  class Animal()
  class Dog() extends Animal()

  def main(args: Array[String]): Unit = {
    // Animal과 Dog가 공통으로 상속받는 최상위 타입은 Animal이므로 아래 코드는 정상 실행한다.
    val array:Array[Animal] = Array(new Animal(), new Dog())
    // val wrongArray:Array[Dog] = Array(new Animal(), new Dog()) 올바르지 않은 타입

    // List도 같은 원리로 동작 (Animal이 List의 element의 타입)
    val list:List[Animal] = List(new Animal(), new Dog())

    // Set도 같은 원리로 동작한다. (Animal이 Set의 element의 타입)
    val set:Set[Animal] = Set(new Animal(), new Dog())

    // Map도 같은 원리로 동작한다.
    val map:Map[String, Animal] = Map("Animal" -> new Animal(), "Dog" -> new Dog())

    println(s"1. $array, $list, $set, $map")
  }
}
