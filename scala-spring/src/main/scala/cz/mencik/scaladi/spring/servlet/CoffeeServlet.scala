package cz.mencik.scaladi.spring.servlet

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.HttpRequestHandler

import cz.mencik.scaladi.spring.example._
import javax.servlet.http._

@Component
class CoffeeServlet @Autowired() (private val coffeeMaker: CoffeeMaker) extends HttpRequestHandler {

  override def handleRequest(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    val c = coffeeMaker.makeCoffee
    resp.getWriter().println("Hello have a cup of: " + c)
  }

}