import java.lang.IllegalStateException

fun main() {
    var customerOne = Customer(name = "Sebastine", email = "sebastinesoacatp@gmail.com")
    var customerTwo = Customer(name = "Sebastine", email = "sebastinesoacatp@gmail.com")

    var customerThree = customerTwo.copy("Christain", "christain@gmail.com")

    println(customerThree.toString())
}

data class Customer(val name: String, val email: String){
    override fun toString(): String {
        return "name: $name, email: $email"
    }
}

//class Turtle {
//    fun penDown()
//    fun penUp()
//    fun turen(degrees: Double)
//    fun forward(pixels: Double)
//}

fun describe(obj: Any): String = when (obj){
  1 -> "One"
  "Hello" -> "Greeting"
  is Long -> "Long"
  !is String -> "Not a string"
  else -> "Unknown"
}

abstract  class MyAbstractClass {
    abstract  fun doSomething()
    abstract  fun sleep()
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

// singleton
object Resource {
    val name = "Name"
}