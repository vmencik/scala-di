package cz.mencik.scaladi.cdi.example.impl
import cz.mencik.scaladi.cdi.Deluxe

import cz.mencik.scaladi.cdi.example._
import cz.mencik.scaladi.cdi.example.FoamQuality._

class AutomaticFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Average)

}

@Deluxe
class ManualFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Excellent)

}