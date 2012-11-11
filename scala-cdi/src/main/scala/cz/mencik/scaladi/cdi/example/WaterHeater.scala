package cz.mencik.scaladi.cdi.example

trait WaterHeater {

  def heatWater: HotWater

}

case class HotWater(timeSpentHeating: Int)
