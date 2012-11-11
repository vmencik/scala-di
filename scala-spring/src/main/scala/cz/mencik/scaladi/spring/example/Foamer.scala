package cz.mencik.scaladi.spring.example

trait Foamer {

  def makeFoam: Foam

}

object FoamQuality extends Enumeration {
  type FoamQuality = Value
  val Average = Value("Average")
  val Excellent = Value("Excellent")
}
import FoamQuality._
case class Foam(quality: FoamQuality)