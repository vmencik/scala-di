package com.jakubjanecek.cse.scaladi.subcut.impl

import com.jakubjanecek.cse.scaladi.subcut._

class AutomaticFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Average)

}

class ManualFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Excellent)

}