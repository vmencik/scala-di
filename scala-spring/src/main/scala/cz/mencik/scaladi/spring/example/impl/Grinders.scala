package cz.mencik.scaladi.spring.example.impl

import cz.mencik.scaladi.spring.example.grinder._
import cz.mencik.scaladi.spring.example.grinder.GrindFineness._
import cz.mencik.scaladi.spring.Standard
import org.springframework.stereotype.Component
import cz.mencik.scaladi.spring.Deluxe

@Deluxe @Component
class RoughGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Coarse)

}

@Standard @Component
class FineGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Fine)

}