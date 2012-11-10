package cz.mencik.scaladi.spring.example

import grinder.GrindFineness._
import foam.FoamQuality._

trait Coffee {

  def timeSpentHeating: Int

  def grindFineness: GrindFineness

  def foamQuality: FoamQuality

}