package net.prihoda.cse.scaladi.cake

object MyEspressoMachine extends App with EspressoMachine with FineGrinderComponent with AutomaticFoamerComponent with FastWaterHeaterComponent {
  println(makeCoffee)
}