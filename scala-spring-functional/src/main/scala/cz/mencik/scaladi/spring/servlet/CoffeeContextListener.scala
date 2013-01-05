package cz.mencik.scaladi.spring.servlet

import javax.servlet.ServletContextListener
import javax.servlet.ServletContextEvent
import org.springframework.scala.context.function.FunctionalConfigApplicationContext
import cz.mencik.scaladi.spring.example.impl.DeluxeConfiguration
import cz.mencik.scaladi.spring.example.impl.StandardConfiguration

class CoffeeContextListener extends ServletContextListener {

  // This is a very simple proof-of-concept of working with https://github.com/SpringSource/spring-scala
  // in servlet environment.
  // In future, SpringScala could provide a fully-fledged WebApplicationContext implementation
  // that could be created from a FunctionalConfiguration.
  
  def contextInitialized(sce: ServletContextEvent): Unit = {
    val ctx = new FunctionalConfigApplicationContext(classOf[StandardConfiguration])
    sce.getServletContext().setAttribute(CoffeeConstants.AppContextKey, ctx)
  }

  def contextDestroyed(sce: ServletContextEvent): Unit = {
    sce.getServletContext().getAttribute(CoffeeConstants.AppContextKey) match {
      case ctx: FunctionalConfigApplicationContext =>
        ctx.close()
      case _ =>
    }
    
  }

}

object CoffeeConstants {
  val AppContextKey = "Coffee.Context"
}