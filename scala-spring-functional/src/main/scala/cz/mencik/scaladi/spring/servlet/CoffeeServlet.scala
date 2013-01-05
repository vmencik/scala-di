package cz.mencik.scaladi.spring.servlet
import scala.reflect.ClassManifest

import org.springframework.context.ApplicationContext

import cz.mencik.scaladi.spring.example.impl.EspressoMachine
import javax.servlet.http._

class CoffeeServlet extends HttpServlet {

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse) = {
    val coffeeMaker = springBean[EspressoMachine]
    val c = coffeeMaker.makeCoffee
    resp.getWriter().println("Hello have a cup of: " + c)
  }
  
  // again, just a proof-of-concept
  // this logic could be placed in some trait that would be mixed into servlets
  private def springBean[T : ClassManifest]: T = {
    getServletContext().getAttribute(CoffeeConstants.AppContextKey) match {
      case ctx: ApplicationContext =>
        ctx.getBean(classManifest[T].erasure.asInstanceOf[Class[T]])
      case _ => throw new IllegalArgumentException("ApplicationContext not found")
    }
  }

}