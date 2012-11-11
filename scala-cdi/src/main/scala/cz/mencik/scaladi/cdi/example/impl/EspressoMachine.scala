package cz.mencik.scaladi.cdi.example.impl

import cz.mencik.scaladi.cdi.example._
import cz.mencik.scaladi.cdi.example.FoamQuality._
import cz.mencik.scaladi.cdi.example.GrindFineness._
import javax.inject.Inject

class EspressoMachine @Inject() (heater: WaterHeater, grinder: Grinder, foamer: Foamer) {

  private case class Espresso(timeSpentHeating: Int, grindFineness: GrindFineness, foamQuality: FoamQuality) extends Coffee

  def makeCoffee: Coffee = {
    val water = heater.heatWater
    val beans = grinder.grind
    val foam = foamer.makeFoam
    Espresso(water.timeSpentHeating, beans.fineness, foam.quality)
  }

}