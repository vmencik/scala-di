package com.jakubjanecek.cse.scaladi.subcut.impl

import com.jakubjanecek.cse.scaladi.subcut._

class RoughGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Coarse)

}

class FineGrinder extends Grinder {

  def grind: GroundBeans = GroundBeans(GrindFineness.Fine)

}