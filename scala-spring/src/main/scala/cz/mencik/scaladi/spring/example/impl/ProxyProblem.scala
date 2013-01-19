package cz.mencik.scaladi.spring.example.impl

class AuthorizedUser {

  // in the compiled bytecode there is a final method created
  // for this field ant this class cannot be proxied
  private val userId: Int = 15

  def someMethod: Seq[Int] = {
    val numbers = 1 to 100
    // if we remove the use of the field in the closure,
    // the final method will not be emitted
    numbers filter { _ % 2 == 0 }
  }
}