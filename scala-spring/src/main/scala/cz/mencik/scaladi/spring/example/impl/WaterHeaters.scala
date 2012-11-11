package cz.mencik.scaladi.spring.example.impl

import cz.mencik.scaladi.spring.example.WaterHeater
import cz.mencik.scaladi.spring.example.HotWater
import cz.mencik.scaladi.spring.Standard
import org.springframework.stereotype.Component
import cz.mencik.scaladi.spring.Deluxe

@Deluxe @Component
class FastWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(20)

}

@Standard @Component
class SlowWaterHeater extends WaterHeater {

  def heatWater(): HotWater = HotWater(300)

}