package cz.mencik.scaladi.cdi.servlet

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.annotation.WebServlet
import cz.mencik.scaladi.cdi.example.impl.EspressoMachine
import javax.inject.Inject

@WebServlet(urlPatterns = Array("/coffee/*"))
class CoffeeServlet extends HttpServlet {

  // servlets have only a default no-args constructor
  // so constructor injection is out of the question

  @Inject
  private var coffeeMaker: EspressoMachine = _

  override def doGet(req: HttpServletRequest, resp: HttpServletResponse): Unit = {
    val c = coffeeMaker.makeCoffee
    resp.getWriter().println("Hello have a cup of: " + c)
  }

}