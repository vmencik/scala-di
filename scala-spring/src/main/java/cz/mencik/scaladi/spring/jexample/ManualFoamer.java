package cz.mencik.scaladi.spring.jexample;

import org.springframework.stereotype.Component;

import cz.mencik.scaladi.spring.example.Foam;
import cz.mencik.scaladi.spring.example.FoamQuality;
import cz.mencik.scaladi.spring.example.Foamer;

@Component
public class ManualFoamer implements Foamer {

	@Override
	public Foam makeFoam() {
		return new Foam(FoamQuality.Excellent());
	}

}
