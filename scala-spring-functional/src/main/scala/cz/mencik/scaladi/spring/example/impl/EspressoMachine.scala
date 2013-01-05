package cz.mencik.scaladi.spring.example.impl

import cz.mencik.scaladi.spring.example._
import cz.mencik.scaladi.spring.example.FoamQuality._
import cz.mencik.scaladi.spring.example.GrindFineness._

class EspressoMachine (heater: WaterHeater, grinder: Grinder, foamer: Foamer) {

  private case class Espresso(timeSpentHeating: Int, grindFineness: GrindFineness, foamQuality: FoamQuality) extends Coffee

  def makeCoffee: Coffee = {
    val water = heater.heatWater
    val beans = grinder.grind
    val foam = foamer.makeFoam
    Espresso(water.timeSpentHeating, beans.fineness, foam.quality)
  }

}