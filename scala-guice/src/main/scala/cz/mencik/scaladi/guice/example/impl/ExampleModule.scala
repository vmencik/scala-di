package cz.mencik.scaladi.guice.example.impl

import com.google.inject.AbstractModule
import cz.mencik.scaladi.guice.example._
import net.codingwell.scalaguice.ScalaModule

class ExampleModule extends AbstractModule {

  protected def configure(): Unit = {
    bind(classOf[WaterHeater]) to classOf[FastWaterHeater]

    bind(classOf[Foamer]) to classOf[ManualFoamer]

    bind(classOf[Grinder]) to classOf[RoughGrinder]
  }

}

class ScalifiedExampleModule extends AbstractModule with ScalaModule {

  protected def configure(): Unit = {
    bind[WaterHeater].to[FastWaterHeater]
    bind[Foamer].to[ManualFoamer]
    bind[Grinder].to[RoughGrinder]
  }
}