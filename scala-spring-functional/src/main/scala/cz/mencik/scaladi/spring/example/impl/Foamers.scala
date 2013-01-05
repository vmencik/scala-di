package cz.mencik.scaladi.spring.example.impl

import cz.mencik.scaladi.spring.example._
import cz.mencik.scaladi.spring.example.FoamQuality._

class AutomaticFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Average)

}

class ManualFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Excellent)

}