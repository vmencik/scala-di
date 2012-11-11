package cz.mencik.scaladi.guice.example.impl

import cz.mencik.scaladi.guice.example._
import cz.mencik.scaladi.guice.example.GrindFineness._

class RoughGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Coarse)

}

class FineGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Fine)

}