package cz.mencik.scaladi.spring.example

trait WaterHeater {

  def heatWater: HotWater

}

case class HotWater(timeSpentHeating: Int)
