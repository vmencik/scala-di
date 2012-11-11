package cz.mencik.scaladi.cdi.example.impl
import cz.mencik.scaladi.cdi.Deluxe
import cz.mencik.scaladi.cdi.example.HotWater

import cz.mencik.scaladi.cdi.example.WaterHeater

@Deluxe
class FastWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(20)

}

class SlowWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(300)

}