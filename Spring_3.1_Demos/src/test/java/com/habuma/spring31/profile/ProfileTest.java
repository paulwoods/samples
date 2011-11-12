package com.habuma.spring31.profile;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.habuma.spring31.CompactDisc;
import com.habuma.spring31.EightTrack;

public class ProfileTest {
	@After
	public void clearProperties() {
		System.clearProperty("spring.profiles.active");
	}
	
	@Test
	public void shouldGoWithNoProfile() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/habuma/spring31/profile/profiles.xml");
		
		CompactDisc cd1 = context.getBean("album1", CompactDisc.class);
		assertEquals("Rattle and Hum", cd1.getTitle());
		assertEquals("U2", cd1.getArtist());
		
		assertFalse(context.containsBean("album2"));
		assertFalse(context.containsBean("album3"));
	}
	
	@Test
	public void shouldLoadHardRock() {
		System.setProperty("spring.profiles.active", "hardRock");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/habuma/spring31/profile/profiles.xml");
		
		CompactDisc cd1 = context.getBean("album1", CompactDisc.class);
		assertEquals("Rattle and Hum", cd1.getTitle());
		assertEquals("U2", cd1.getArtist());
		
		CompactDisc cd2 = context.getBean("album2", CompactDisc.class);
		assertEquals("Slippery When Wet", cd2.getTitle());
		assertEquals("Bon Jovi", cd2.getArtist());

		CompactDisc cd3 = context.getBean("album3", CompactDisc.class);
		assertEquals("1984", cd3.getTitle());
		assertEquals("Van Halen", cd3.getArtist());
	}
	
	@Test
	public void shouldLoadSoftRock() {
		System.setProperty("spring.profiles.active", "softRock");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/habuma/spring31/profile/profiles.xml");
		
		CompactDisc cd1 = context.getBean("album1", CompactDisc.class);
		assertEquals("Rattle and Hum", cd1.getTitle());
		assertEquals("U2", cd1.getArtist());
		
		CompactDisc cd2 = context.getBean("album2", CompactDisc.class);
		assertEquals("Suddenly", cd2.getTitle());
		assertEquals("Billy Ocean", cd2.getArtist());

		CompactDisc cd3 = context.getBean("album3", CompactDisc.class);
		assertEquals("Can't Slow Down", cd3.getTitle());
		assertEquals("Lionel Richie", cd3.getArtist());
	}
	
	@Test
	public void shouldLoadOldSchool() {
		System.setProperty("spring.profiles.active", "oldSchool");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/habuma/spring31/profile/profiles.xml");
		
		CompactDisc cd1 = context.getBean("album1", CompactDisc.class);
		assertEquals("Rattle and Hum", cd1.getTitle());
		assertEquals("U2", cd1.getArtist());
		
		EightTrack album2 = context.getBean("album2", EightTrack.class);
		assertEquals("Hotel California", album2.getTitle());
		assertEquals("Eagles", album2.getArtist());

		EightTrack album3 = context.getBean("album3", EightTrack.class);
		assertEquals("Leftoverture", album3.getTitle());
		assertEquals("Kansas", album3.getArtist());
	}	
}
