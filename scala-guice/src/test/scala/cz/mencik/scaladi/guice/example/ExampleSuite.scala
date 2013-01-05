package cz.mencik.scaladi.guice.example

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import com.google.inject.Guice
import cz.mencik.scaladi.guice.example._
import cz.mencik.scaladi.guice.example.FoamQuality._
import cz.mencik.scaladi.guice.example.GrindFineness._
import cz.mencik.scaladi.guice.example.impl.EspressoMachine
import cz.mencik.scaladi.guice.example.impl.ExampleModule
import net.codingwell.scalaguice.InjectorExtensions.ScalaInjector

class ExampleSuite extends FunSuite with ShouldMatchers {

  val inj = Guice.createInjector(new ExampleModule)
  val scalaInj = new ScalaInjector(inj)

  test("We can inject coffee maker using Guice and make coffee") {
    val espressoMachine = inj.getInstance(classOf[EspressoMachine])
    espressoMachine.makeCoffee
  }

  test("We can inject coffee maker using Guice + Scala wrappers and make coffee") {
    val espressoMachine = scalaInj.instance[EspressoMachine]
    espressoMachine.makeCoffee
  }

  test("The coffe should have required properties") {
    val espressoMachine = inj.getInstance(classOf[EspressoMachine])
    checkCoffeeProperties(espressoMachine.makeCoffee)
  }

  test("The coffe should have required properties - even whe using the Scala wrappers") {
    val espressoMachine = scalaInj.instance[EspressoMachine]
    checkCoffeeProperties(espressoMachine.makeCoffee)
  }

  private def checkCoffeeProperties(coffee: Coffee): Unit = {
    coffee.foamQuality should be(Excellent)
    coffee.grindFineness should be(Coarse)
    coffee.timeSpentHeating should be < (50)
  }

}