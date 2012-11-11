package cz.mencik.scaladi.guice.example

trait WaterHeater {

  def heatWater: HotWater

}

case class HotWater(timeSpentHeating: Int)
