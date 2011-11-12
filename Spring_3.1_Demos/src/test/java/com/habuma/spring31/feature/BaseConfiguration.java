package com.habuma.spring31.feature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.habuma.spring31.CompactDisc;

@Configuration
public class BaseConfiguration {
	@Bean
	public CompactDisc album1() {
		return new CompactDisc("Rattle and Hum", "U2");
	}
}
