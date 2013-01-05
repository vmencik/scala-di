package cz.mencik.scaladi.spring.example.impl
import cz.mencik.scaladi.spring.example.GrindFineness._

import cz.mencik.scaladi.spring.example._

class RoughGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Coarse)

}

class FineGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Fine)

}