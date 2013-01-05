package cz.mencik.scaladi.spring.example.impl

import org.springframework.scala.context.function.FunctionalConfiguration

class StandardConfiguration extends FunctionalConfiguration {
  // the individual components are exposed as Spring beans
  // we could of course expose only the EspressoMachine
  val foamer = bean() {
    new AutomaticFoamer
  }
  val grinder = bean() {
    new FineGrinder
  }
  val heater = bean() {
    new SlowWaterHeater
  }
  bean() {
    new EspressoMachine(heater(), grinder(), foamer())
  }
}

class DeluxeConfiguration extends FunctionalConfiguration {
  val foamer = bean() {
    new ManualFoamer
  }
  val grinder = bean() {
    new RoughGrinder
  }
  val heater = bean() {
    new FastWaterHeater
  }
  bean() {
    new EspressoMachine(heater(), grinder(), foamer())
  }
}