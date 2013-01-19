package cz.mencik.scaladi.spring.jexample;

import org.springframework.stereotype.Component;

import cz.mencik.scaladi.spring.example.GrindFineness;
import cz.mencik.scaladi.spring.example.Grinder;
import cz.mencik.scaladi.spring.example.GroundBeans;

@Component
public class RoughGrinder implements Grinder {

	@Override
	public GroundBeans grind() {
		return new GroundBeans(GrindFineness.Coarse());
	}

}
