package cz.mencik.scaladi.spring.example

trait Grinder {

  def grind: GroundBeans

}

object GrindFineness extends Enumeration {
  type GrindFineness = Value
  val Coarse = Value("Coarse")
  val Fine = Value("Fine")
}
import GrindFineness._
case class GroundBeans(fineness: GrindFineness)