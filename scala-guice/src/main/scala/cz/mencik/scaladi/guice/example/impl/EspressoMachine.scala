package cz.mencik.scaladi.guice.example.impl
import com.google.inject.Inject
import cz.mencik.scaladi.guice.example._
import cz.mencik.scaladi.guice.example.FoamQuality._
import cz.mencik.scaladi.guice.example.GrindFineness._

class EspressoMachine @Inject() (heater: WaterHeater, grinder: Grinder, foamer: Foamer) {

  private case class Espresso(timeSpentHeating: Int, grindFineness: GrindFineness, foamQuality: FoamQuality) extends Coffee

  def makeCoffee: Coffee = {
    val water = heater.heatWater
    val beans = grinder.grind
    val foam = foamer.makeFoam
    Espresso(water.timeSpentHeating, beans.fineness, foam.quality)
  }

}