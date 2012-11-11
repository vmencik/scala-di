package cz.mencik.scaladi.spring.example

import GrindFineness._
import FoamQuality._

trait Coffee {

  def timeSpentHeating: Int

  def grindFineness: GrindFineness

  def foamQuality: FoamQuality

}