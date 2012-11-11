package cz.mencik.scaladi.cdi.example.impl
import cz.mencik.scaladi.cdi.Deluxe

import cz.mencik.scaladi.cdi.example._
import cz.mencik.scaladi.cdi.example.GrindFineness._

@Deluxe
class RoughGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Coarse)

}

class FineGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Fine)

}