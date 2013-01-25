package cz.mencik.scaladi.spring.example.impl
import java.util.logging.Logger
import java.util.logging.Level

class AuthorizedUser {

  // in the compiled bytecode there is a final method created
  // for this field and this class cannot be proxied
  private val logger = Logger.getLogger("my.logger")

  def someMethod: Unit = {
    val colors = List("Red", "Green", "Blue")

    colors foreach { c =>
      // if we remove the use of the field in the closure,
      // the final method will not be emitted
      logger.log(Level.INFO, c)
    }
  }

}