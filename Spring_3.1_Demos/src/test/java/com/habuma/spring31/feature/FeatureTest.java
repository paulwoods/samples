package com.habuma.spring31.feature;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.habuma.spring31.CompactDisc;

public class FeatureTest {
	@Test
	public void shouldLoadSimpleConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext(BaseConfiguration.class);
		
		CompactDisc cd1 = context.getBean("album1", CompactDisc.class);
		assertEquals("Rattle and Hum", cd1.getTitle());
		assertEquals("U2", cd1.getArtist());
		
		// should NOT be in context
		assertFalse(context.containsBean("parachutePants"));
		assertFalse(context.containsBean("boomBox"));
	}
	
	@Test
	public void shouldAlsoDoComponentScanning() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanningConfiguration.class);
		
		CompactDisc cd1 = context.getBean("album1", CompactDisc.class);
		assertEquals("Rattle and Hum", cd1.getTitle());
		assertEquals("U2", cd1.getArtist());
		
		// SHOULD be in context, because MyFeatures sets up a component scan on the
		// com.habuma.spring31.feature.stuff package
		assertTrue(context.containsBean("parachutePants"));
		assertTrue(context.containsBean("boomBox"));		
	}
}
