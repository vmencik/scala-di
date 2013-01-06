package com.jakubjanecek.cse.scaladi.subcut.impl

import com.jakubjanecek.cse.scaladi.subcut._

class FastWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(20)

}

class SlowWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(300)

}