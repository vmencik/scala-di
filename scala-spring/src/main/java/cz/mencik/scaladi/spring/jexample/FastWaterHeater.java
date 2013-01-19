package cz.mencik.scaladi.spring.jexample;

import org.springframework.stereotype.Component;

import cz.mencik.scaladi.spring.example.HotWater;
import cz.mencik.scaladi.spring.example.WaterHeater;

@Component
public class FastWaterHeater implements WaterHeater {

	@Override
	public HotWater heatWater() {
		return new HotWater(20);
	}

}
