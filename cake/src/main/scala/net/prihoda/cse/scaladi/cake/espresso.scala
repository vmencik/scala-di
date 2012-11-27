package net.prihoda.cse.scaladi.cake

trait WaterHeaterComponent {
  def heater: WaterHeater

  trait WaterHeater {
    def heatWater: HotWater
  }
}

trait GrinderComponent {
  def grinder: Grinder

  trait Grinder {
    def grind: GroundBeans
  }
}

trait FoamerComponent {
  def foamer: Foamer

  trait Foamer {
    def makeFoam: Foam
  }
}

trait EspressoMachine {
  self: WaterHeaterComponent with GrinderComponent with FoamerComponent =>

  import GrindFineness._
  import FoamQuality._

  def heater: WaterHeater
  def grinder: Grinder
  def foamer: Foamer

  case class Espresso(timeSpentHeating: Int, grindFineness: GrindFineness, foamQuality: FoamQuality) extends Coffee

  def makeCoffee = {
    val water = heater.heatWater
    val beans = grinder.grind
    val foam = foamer.makeFoam
    Espresso(water.timeSpentHeating, beans.fineness, foam.quality)
  }
}