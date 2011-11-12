package com.habuma.spring31.property;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;

public class MyContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	public void initialize(ConfigurableApplicationContext context) {
		MutablePropertySources propertySources = context.getEnvironment().getPropertySources();
		propertySources.addFirst(new ChuckNorrisPropertySource("chuck"));
	}
}
