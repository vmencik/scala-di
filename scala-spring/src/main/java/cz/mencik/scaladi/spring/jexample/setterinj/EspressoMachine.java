package cz.mencik.scaladi.spring.jexample.setterinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cz.mencik.scaladi.spring.example.Coffee;
import cz.mencik.scaladi.spring.example.WaterHeater;

@Component
public class EspressoMachine {

	private WaterHeater waterHeater;

	@Autowired
	public void setWaterHeater(WaterHeater waterHeater) {
		this.waterHeater = waterHeater;
	}

	public Coffee makeCoffee() {
		if (waterHeater == null) {
			throw new IllegalStateException("Oops");
		}
		throw new UnsupportedOperationException("This is not fully functional");
	}
}
