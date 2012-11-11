package cz.mencik.scaladi.guice.example.impl

import cz.mencik.scaladi.guice.example._
import cz.mencik.scaladi.guice.example.FoamQuality._

class AutomaticFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Average)

}

class ManualFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Excellent)

}