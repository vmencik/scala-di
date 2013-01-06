package com.jakubjanecek.cse.scaladi.subcut

trait WaterHeater {

  def heatWater: HotWater

}

case class HotWater(timeSpentHeating: Int)
