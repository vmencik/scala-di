package cz.mencik.scaladi.spring.example.impl

import cz.mencik.scaladi.spring.example.water.WaterHeater
import cz.mencik.scaladi.spring.example.grinder.Grinder
import cz.mencik.scaladi.spring.example.foam.Foamer
import cz.mencik.scaladi.spring.example.Coffee
import cz.mencik.scaladi.spring.example.grinder.GrindFineness._
import cz.mencik.scaladi.spring.example.foam.FoamQuality._
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