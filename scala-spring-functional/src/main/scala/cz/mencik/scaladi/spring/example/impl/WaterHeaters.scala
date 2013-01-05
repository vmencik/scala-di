package cz.mencik.scaladi.spring.example.impl

import cz.mencik.scaladi.spring.example.HotWater

import cz.mencik.scaladi.spring.example.WaterHeater

class FastWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(20)

}

class SlowWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(300)

}