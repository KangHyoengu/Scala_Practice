package study

object LearnArray {
  /*
  * 배열은 Array(element1, element2, ...)와 같이 만들 수 있습니다.
  * 자바의 배열에 대응하는 개념입니다. int[]는 Array[int]와 같습니다.
  * 스칼라의 배열은 들어있는 값을 변경할 수 있다.
  * 배열의 내용을 출력하기 위해선 .mkString(",")과 같은 메서드를 사용해야 합니다.
  * */

  // 배열의 내용을 출력하는 메서드
  def printArray[k](array:Array[k]) = println(array.mkString("Array(", ",", ")"))

  def main(args: Array[String]): Unit = {
    // 1. Array[Int]
    val array1 = Array(1, 2, 3)
    print("1. ")
    printArray(array1)

    // 2. Array[Any]
    val array2 = Array("a", 2, true)
    print("2. ")
    printArray(array2)

    // 3. 배열의 값 읽고 쓰기
    val itemAtIndex0 = array1(0)
    println("array1(0) : " + itemAtIndex0)

    array1(0) = 4
    print("3. ")
    printArray(array1)

    // 4. 배열을 붙일때는 ++연산자 사용
    // 앞에 붙일때는 +:, 뒤에 붙일때는 :+ 연산자
    val concatenated = "앞에 붙이기" +: (array1 ++ array2) :+ "뒤에 붙이기"
    print("2. array1과 array2를 더하면: ")
    printArray(concatenated)

    // 값으로 index찾기
    array2.indexOf("a")

    // 5. 다른 값만 가져오기
    val diffArray = Array(1, 2, 3, 4).diff(Array(2, 3))
    print("5. Array(1, 2, 3, 4).diff(Array(2, 3))의 결과: ")
    printArray(diffArray)

    val personArray = Array(("솔라", 1), ("문별", 2), ("휘인", 3))
    // 6. Find 메서드를 이용하요 findByName이라는 메소드 생성
    // Find는 조건에 맞는 값을 찾으면 검색을 중단
    // getOrElse는 일치하는 값이 없을경우 넘겨줄 기본 값
    // getOrElse가 없을 때 일지하는 값이 없으면 None
    def findByName(name:String) = personArray.find(_._1 == name).getOrElse(("화사", 4))
    val findSolar = findByName("솔라")
    val findSun = findByName("태양")

    println(findSolar)
    println(findSun)

    // mkString(",")
    println(Array(1, 2, 3, 4).mkString(","))
  }
}
