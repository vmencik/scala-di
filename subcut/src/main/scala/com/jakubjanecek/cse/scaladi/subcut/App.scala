package com.jakubjanecek.cse.scaladi.subcut

import com.jakubjanecek.cse.scaladi.subcut.impl._
import com.escalatesoft.subcut.inject._

object App {

  def main(args: Array[String]): Unit = {
    implicit val c1 = DeluxeConfiguration
    val superMachine = new EspressoMachine
    println(superMachine.makeCoffee)

    val cheapMachine = new EspressoMachine(CheapConfiguration)
    println(cheapMachine.makeCoffee)
  }

}

object DeluxeConfiguration extends NewBindingModule(module => {
  import module._

  bind[WaterHeater] toSingle new FastWaterHeater
  bind[Grinder] toProvider { getGrinder() }
  bind[Foamer] to newInstanceOf [AutomaticFoamer]

  def getGrinder(): Grinder = new FineGrinder

})

object CheapConfiguration extends NewBindingModule(module => {
  import module._

  bind[WaterHeater] toSingle new SlowWaterHeater

})
