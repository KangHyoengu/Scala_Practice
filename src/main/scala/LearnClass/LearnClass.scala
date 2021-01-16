package LearnClass

object LearnClass {
  /*
  * 스칼라에서는 명시적으로 정의되지 않으면 모두 public으로 간주합니다.
  *
  * 주의
  * private 변수의 이름과 getter, setter가 모두 같은 이름을 가지는 경우를 직접 코드로 구현할 수는 없습니다.
  * getter와 setter를 사용하기 위해서는 private 변수의 이름은 다르게 지정해야 합니다.
  * 메서드명과 구분하기 위해 '_'를 변수명에 앞에 붙이기도 합니다. */

  def main(args: Array[String]): Unit = {
    // 1. 단순한 클래스
    val p1 = new Person1("중기", "송")
    // p1.fname과 p1.lname의 값을 외부에서 가져올 수 없습니다.

    // 2. 메서드를 가지는 클래스
    val p2 = new Person2("혜교", "송")
    // 이 경우에도 p2.fname과 p2.lname의 값을 외부에서 가져올 수는 없습니다.
    // 정의된 greet 메서드를 출력합니다.
    println(s"2. ${p2.greet}")

    // 3. public한 read only fullName을 가지는 클래스
    val p3 = new Person3("구", "진")
    println(s"3. ${p3.fullName}님께 인사합니다. ${p3.greet}")

    // 4. val fname과 var lname을 가지는 클래스
    val p4 = new Person4("지원", "Kim") {
      override def toString: String = s"$lname $fname"
    }
    // val로 선언된 p4.fname과 var로 선언된 p4.lname을 외부에서 읽을 수 있음
    println(s"4. ${p4.lname} ${p4.fname}")

    // 5. Person4클래스를 이용해서 객체를 생성하지만, 해당 객체의 toString메서드만 오버라이드
    val p5 = new Person4("시진", "유") {
      override def toString: String = s"$lname$fname"
    }

    println(s"5. $p5") // 오버라이드 된 toString형태로 출력된다.
  }
}
