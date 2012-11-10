package cz.mencik.scaladi.spring.example.water

trait WaterHeater {

  def heatWater: HotWater

}

case class HotWater(timeSpentHeating: Int)
