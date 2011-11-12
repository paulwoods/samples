package com.habuma.spring31.property;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spring31.CompactDisc;

public class PropertyTest {
	@Test
	public void usePlaceholderConfigurer() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/habuma/spring31/property/property.xml");
		CompactDisc cd1 = ctx.getBean("disc1", CompactDisc.class);
		assertEquals("Rattle and Hum", cd1.getTitle());
		assertEquals("U2", cd1.getArtist());
	}
	
	@Test
	public void useChuckNorris() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/habuma/spring31/property/property.xml");
		ctx.getEnvironment().getPropertySources().addFirst(new ChuckNorrisPropertySource("chuck"));

		// refresh the context to reload beans after new property source has been registered
		ctx.refresh();
		
		CompactDisc cd1 = ctx.getBean("disc1", CompactDisc.class);
		assertEquals("Roundhouse Kick", cd1.getTitle());
		assertEquals("Roundhouse Kick", cd1.getArtist());
	}
}
