package net.prihoda.cse.scaladi.cake

trait FastWaterHeaterComponent extends WaterHeaterComponent {
  val heater = new FastWaterHeater

  class FastWaterHeater extends WaterHeater {
    def heatWater: HotWater = HotWater(20)
  }
}

trait SlowWaterHeaterComponent extends WaterHeaterComponent {
  val heater = new SlowWaterHeater

  class SlowWaterHeater extends WaterHeater {
    def heatWater: HotWater = HotWater(300)
  }
}

trait FineGrinderComponent extends GrinderComponent {
  val grinder = new FineGrinder

  class FineGrinder extends Grinder {
    def grind = GroundBeans(GrindFineness.Fine)
  }
}

trait RoughGrinderComponent extends GrinderComponent {
  val grinder = new RoughGrinder

  class RoughGrinder extends Grinder {
    def grind = GroundBeans(GrindFineness.Coarse)
  }
}

trait AutomaticFoamerComponent extends FoamerComponent {
  def foamer = new AutomaticFoamer

  class AutomaticFoamer extends Foamer {
    def makeFoam = Foam(FoamQuality.Average)
  }
}

trait ManulFoamerComponent extends FoamerComponent {
  def foamer = new ManualFoamer

  class ManualFoamer extends Foamer {
    def makeFoam = Foam(FoamQuality.Excellent)
  }
}