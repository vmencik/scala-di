package cz.mencik.scaladi.spring.example.impl

import cz.mencik.scaladi.spring.example._
import cz.mencik.scaladi.spring.example.FoamQuality._
import cz.mencik.scaladi.spring.Standard
import org.springframework.stereotype.Component
import cz.mencik.scaladi.spring.Deluxe

@Standard @Component
class AutomaticFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Average)

}

@Deluxe @Component
class ManualFoamer extends Foamer {

  def makeFoam: Foam = Foam(FoamQuality.Excellent)

}