package com.jakubjanecek.cse.scaladi.subcut.impl

import com.jakubjanecek.cse.scaladi.subcut._
import com.jakubjanecek.cse.scaladi.subcut.GrindFineness._
import com.jakubjanecek.cse.scaladi.subcut.FoamQuality._
import com.escalatesoft.subcut.inject.{Injectable, BindingModule, NewBindingModule}

class EspressoMachine(implicit val bindingModule: BindingModule) extends Injectable {

  private case class Espresso(timeSpentHeating: Int, grindFineness: GrindFineness, foamQuality: FoamQuality) extends Coffee

  val heater = injectOptional[WaterHeater] getOrElse {
    new FastWaterHeater
  }

  val grinder = injectIfBound[Grinder] {
    new RoughGrinder
  }

  val foamer = inject[Foamer]

  def makeCoffee: Coffee = {
    val water = heater.heatWater
    val beans = grinder.grind
    val foam = foamer.makeFoam
    Espresso(water.timeSpentHeating, beans.fineness, foam.quality)
  }
}
