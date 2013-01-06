package com.jakubjanecek.cse.scaladi.subcut

import com.jakubjanecek.cse.scaladi.subcut.impl._
import com.escalatesoft.subcut.inject.{Injectable, BindingModule, NewBindingModule}

object App {

  def main(args: Array[String]): Unit = {
    implicit val di = SomeConfigurationModule

    val coffeeMachine = new EspressoMachine

    println(coffeeMachine.makeCoffee)
  }

}

object SomeConfigurationModule extends NewBindingModule(module => {
  import module._

  bind[Foamer] toSingle new AutomaticFoamer
  bind[Grinder] toSingle new FineGrinder

  //  bind [X] toSingle Y
  //  bind [Z] toProvider { codeToGetInstanceOfZ() }
  //  bind [A] toProvider { implicit module => new AnotherInjectedClass(param1, param2) }
  //  bind [B] to newInstanceOf [Fred]    // create a new instance of Fred every time - Fred require injection
  //  bind [C] to moduleInstanceOf [Jane] // create a module scoped singleton Jane that will be used
})
