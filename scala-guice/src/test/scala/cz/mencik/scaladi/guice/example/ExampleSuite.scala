package cz.mencik.scaladi.guice.example

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import com.google.inject.Guice

import cz.mencik.scaladi.guice.example._
import cz.mencik.scaladi.guice.example.FoamQuality._
import cz.mencik.scaladi.guice.example.GrindFineness._
import cz.mencik.scaladi.guice.example.impl.EspressoMachine
import cz.mencik.scaladi.guice.example.impl.ExampleModule

class ExampleSuite extends FunSuite with ShouldMatchers {

  val inj = Guice.createInjector(new ExampleModule)

  test("We can inject coffee maker using Guice and make coffee") {
    val espressoMachine = inj.getInstance(classOf[EspressoMachine])
    espressoMachine.makeCoffee
  }

  test("The coffe should have required properties") {
    val espressoMachine = inj.getInstance(classOf[EspressoMachine])
    val coffee = espressoMachine.makeCoffee

    coffee.foamQuality should be(Excellent)
    coffee.grindFineness should be(Coarse)
    coffee.timeSpentHeating should be < (50)
  }

}