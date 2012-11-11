package cz.mencik.scaladi.guice.example.impl

import com.google.inject.AbstractModule
import cz.mencik.scaladi.guice.example._

class ExampleModule extends AbstractModule {

  protected def configure(): Unit = {
    bind(classOf[WaterHeater]) to classOf[FastWaterHeater]

    bind(classOf[Foamer]) to classOf[ManualFoamer]

    bind(classOf[Grinder]) to classOf[RoughGrinder]
  }

}