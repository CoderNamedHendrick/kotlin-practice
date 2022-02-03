fun main() {
  val myObj = MyChildClass()
  myObj.myFunction()
}

fun sumOfTwoNumbers(first: Int, second: Int) : Int {
  return first + second
}


open class MyParentClass {
  val x = 5
}

class MyChildClass: MyParentClass() {
  fun myFunction() {
    println(x)
  }
}