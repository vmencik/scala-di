package cz.mencik.scaladi.spring.example.setterinj
import scala.reflect.BeanProperty
import org.springframework.stereotype.Component
import cz.mencik.scaladi.spring.example.WaterHeater
import org.springframework.beans.factory.annotation.Autowired
import scala.annotation.target.beanSetter
import cz.mencik.scaladi.spring.example.Foamer

@Component
class EspressoMachine {

  @BeanProperty
  @(Autowired @beanSetter)
  var waterHeater: WaterHeater = _

  private var foamer: Foamer = _

  @Autowired
  def setFoamer(foamer: Foamer): Unit =
    this.foamer = foamer

}