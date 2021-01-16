package LearnClass

// 3. public한 val(read only) 필드
class Person3(fname:String, lname:String) {
  val fullName = s"${lname}${fname}" // public한 val 필드

  def greet = s"${fullName}님 안녕하세요!" // public한 method
}
