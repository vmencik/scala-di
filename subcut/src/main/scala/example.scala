import com.escalatesoft.subcut.inject.{Injectable, BindingModule, NewBindingModule}

trait WaterHeater {

  def heat

}

object FastWaterHeater extends WaterHeater {

  def heat = println("quickly heating some water")

}

object SlowWaterHeater extends WaterHeater {

  def heat = println("slowly heating some water")

}


trait Grinder {

  def grind

}

object RoughGrinder extends Grinder {

  def grind = println("grinding the coffee roughly")

}

object FineGrinder extends Grinder {

  def grind = println("it's gonna be fine powder")

}


trait Foamer {

  def makeFoam

}

object AutomaticFoamer extends Foamer {

  def makeFoam = println("making foam automatically")

}

object ManualFoamer extends Foamer {

  def makeFoam = println("hey you, make some foam if you want it")

}


class EspressoMachine(implicit val bindingModule: BindingModule) extends Injectable {

  val heater = injectOptional[WaterHeater] getOrElse {
    SlowWaterHeater
  }

  val grinder = injectOptional[Grinder] getOrElse {
    RoughGrinder
  }

  val foamer = injectOptional[Foamer] getOrElse {
    ManualFoamer
  }

  def makeCoffee = {
    heater.heat
    grinder.grind
    foamer.makeFoam
  }

}


object SomeConfigurationModule extends NewBindingModule(module => {
  import module._

  bind[Foamer] toSingle AutomaticFoamer

  //  bind [X] toSingle Y
  //  bind [Z] toProvider { codeToGetInstanceOfZ() }
  //  bind [A] toProvider { implicit module => new AnotherInjectedClass(param1, param2) }
  //  bind [B] to newInstanceOf [Fred]    // create a new instance of Fred every time - Fred require injection
  //  bind [C] to moduleInstanceOf [Jane] // create a module scoped singleton Jane that will be used
})

object App {

  def main(args: Array[String]): Unit = {
    implicit val di = SomeConfigurationModule

    val coffeeMachine = new EspressoMachine

    coffeeMachine.makeCoffee
  }

}
