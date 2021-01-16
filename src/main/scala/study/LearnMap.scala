package study

object LearnMap {
  /*
   * Map은 Map(key1 -> value1, key2 -> value2, ...)와 같이 생성합니다.
   * 기본 Map은 Predef.Map(scala.collection.immutable.Map)입니다.
   * Set과 마찬가지로 구성요소가 4개 까지는 별도 클래스로 구현되지만 더 많아지면 HashMap으로 구현됩니다.
   * 키는 중복할 수 없으며 Set과 마찬가지로 순서가 보장되지 않습니다.
   */

  def main(args: Array[String]): Unit = {
    // 1. Map[String, Int]타입의 맵
    val map1 = Map("one" -> 1, "two" -> 2, "three" -> 3)

    // Map[Any, Any] 타입의 맵
    val map2 = Map(1 -> "one", "2" -> 2.0, "three" -> false)
    println(s"1. $map1, $map2")

    // 2. 중복된 키가 있으면 마지막 값을 사용한다.
    println(s"2. ${Map('a' -> 1, 'a' -> 2)}")

    // 3. key를 가지고 값을 읽어오기
    val one = map1("one")
    println(s"3. $one")

    /*
     * 4. 키가 없으면 NoSuchElementException이 발생한다.
     * 예를들어 이런경우 > val fourExists = map1("four")
     * get메서드를 이용해서 얻어오는 객체의 isDefine값으로 Key가 있는지 확인 가능
     */
    val fourExistsOption = map1.get("four")
    println(s"4. ${fourExistsOption.isDefined}")

    // 5. ++연산자로 두개의 Map을 더할수 있으며, 중복된 키의 값을 마지막 값으로 결정
    val concatenated = map1 ++ map2
    println(s"5. $concatenated")

    // 6. find (List, Set과 같은 형태)
    val personMap = Map(("솔라", 1), ("문별", 2), ("휘인", 4))
    def findByName(name:String) = personMap.getOrElse(name, 4)
    val findSolar = findByName("솔라")
    val findSun = findByName("태양")

    println(s"6. $findSolar, $findSun")
  }
}
