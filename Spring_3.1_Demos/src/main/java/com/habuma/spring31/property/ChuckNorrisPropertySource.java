package com.habuma.spring31.property;
import org.springframework.core.env.PropertySource;

public class ChuckNorrisPropertySource extends PropertySource<Object> {
	public ChuckNorrisPropertySource(String name) {
		super(name);
	}

	@Override
	public Object getProperty(String name) {
		System.out.println("Chuck says...");
		return "Roundhouse Kick";
	}
}
