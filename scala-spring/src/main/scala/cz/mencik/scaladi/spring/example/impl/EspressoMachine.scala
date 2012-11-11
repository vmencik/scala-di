package cz.mencik.scaladi.spring.example.impl

import cz.mencik.scaladi.spring.example._
import cz.mencik.scaladi.spring.example.GrindFineness._
import cz.mencik.scaladi.spring.example.FoamQuality._
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import cz.mencik.scaladi.spring.Deluxe
import cz.mencik.scaladi.spring.Standard

@Component
class EspressoMachine @Autowired() (@Standard heater: WaterHeater, @Standard grinder: Grinder, @Standard foamer: Foamer) {

  private case class Espresso(timeSpentHeating: Int, grindFineness: GrindFineness, foamQuality: FoamQuality) extends Coffee

  def makeCoffee: Coffee = {
    val water = heater.heatWater
    val beans = grinder.grind
    val foam = foamer.makeFoam
    Espresso(water.timeSpentHeating, beans.fineness, foam.quality)
  }

}