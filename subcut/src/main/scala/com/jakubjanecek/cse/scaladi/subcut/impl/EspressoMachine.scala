package com.jakubjanecek.cse.scaladi.subcut.impl

import com.jakubjanecek.cse.scaladi.subcut._
import com.jakubjanecek.cse.scaladi.subcut.GrindFineness._
import com.jakubjanecek.cse.scaladi.subcut.FoamQuality._
import com.escalatesoft.subcut.inject._

class EspressoMachine(implicit val bindingModule: BindingModule) extends Injectable {

  private case class Espresso(timeSpentHeating: Int, grindFineness: GrindFineness, foamQuality: Option[FoamQuality]) extends Coffee

  val heater = inject[WaterHeater]

  val foamer = injectOptional[Foamer]

  val grinder = injectIfBound[Grinder] {
    new RoughGrinder
  }

  def makeCoffee: Coffee = {
    val water = heater.heatWater
    val beans = grinder.grind
    val foam = for (f <- foamer) yield f.makeFoam.quality
    Espresso(water.timeSpentHeating, beans.fineness, foam)
  }
}
