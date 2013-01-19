package cz.mencik.scaladi.spring.jexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import scala.Enumeration.Value;
import cz.mencik.scaladi.spring.example.Coffee;
import cz.mencik.scaladi.spring.example.Foam;
import cz.mencik.scaladi.spring.example.Foamer;
import cz.mencik.scaladi.spring.example.Grinder;
import cz.mencik.scaladi.spring.example.GroundBeans;
import cz.mencik.scaladi.spring.example.HotWater;
import cz.mencik.scaladi.spring.example.WaterHeater;

@Component
public class EspressoMachine {

	private final WaterHeater heater;
	private final Grinder grinder;
	private final Foamer foamer;

	@Autowired
	public EspressoMachine(WaterHeater heater, Grinder grinder, Foamer foamer) {
		this.heater = heater;
		this.grinder = grinder;
		this.foamer = foamer;
	}

	public Coffee makeCoffee() {
		HotWater water = heater.heatWater();
		GroundBeans beans = grinder.grind();
		Foam foam = foamer.makeFoam();
		return new Espresso(water.timeSpentHeating(), beans.fineness(), foam.quality());
	}

	private static class Espresso implements Coffee {

		private final int timeSpentHeating;
		private final Value grindFineness;
		private final Value foamQuality;

		public Espresso(int timeSpentHeating, Value grindFineness, Value foamQuality) {
			this.timeSpentHeating = timeSpentHeating;
			this.grindFineness = grindFineness;
			this.foamQuality = foamQuality;
		}

		@Override
		public int timeSpentHeating() {
			return timeSpentHeating;
		}

		@Override
		public Value grindFineness() {
			return grindFineness;
		}

		@Override
		public Value foamQuality() {
			return foamQuality;
		}

	}
}
