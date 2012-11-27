package net.prihoda.cse.scaladi.cake

object FoamQuality extends Enumeration {
  type FoamQuality = Value
  val Average = Value("Average")
  val Excellent = Value("Excellent")
}

object GrindFineness extends Enumeration {
  type GrindFineness = Value
  val Coarse = Value("Coarse")
  val Fine = Value("Fine")
}

import FoamQuality._
import GrindFineness._

case class HotWater(timeSpentHeating: Int)

case class GroundBeans(fineness: GrindFineness)

case class Foam(quality: FoamQuality)


trait Coffee {
  def timeSpentHeating: Int
  def grindFineness: GrindFineness
  def foamQuality: FoamQuality
}