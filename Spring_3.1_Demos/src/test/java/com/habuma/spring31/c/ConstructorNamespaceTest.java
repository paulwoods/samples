package com.habuma.spring31.c;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.habuma.spring31.CDPlayer;
import com.habuma.spring31.CompactDisc;
import com.habuma.spring31.Headphones;
import com.habuma.spring31.Radio;
import com.habuma.spring31.Speakers;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:com/habuma/spring31/c/c-namespace.xml")
public class ConstructorNamespaceTest {
	@Autowired
	private ApplicationContext context;

	@Test
	public void shouldInjectConstructorArgumentValuesByName() {
		CompactDisc disc = context.getBean("disc1", CompactDisc.class);
		assertEquals("Rattle and Hum", disc.getTitle());
		assertEquals("U2", disc.getArtist());
	}

	@Test
	public void shouldInjectConstructorArgumentValuesByIndex() {
		CompactDisc disc = context.getBean("disc2", CompactDisc.class);
		assertEquals("Slippery When Wet", disc.getTitle());
		assertEquals("Bon Jovi", disc.getArtist());

		disc = context.getBean("disc3", CompactDisc.class);
		assertEquals("1984", disc.getTitle());
		assertEquals("Van Halen", disc.getArtist());
	}

	@Test
	public void shouldInjectSimpleConstructorArgumentValue() {
		CompactDisc disc = context.getBean("disc4", CompactDisc.class);
		assertEquals("Hot Tracks", disc.getTitle());
	}

	@Test
	public void shouldInjectConstructorArgumentReferencesByName() {
		CDPlayer player = context.getBean("player1", CDPlayer.class);
		assertTrue(player.getOutput() instanceof Headphones);
		assertEquals("Rattle and Hum", player.getDisc().getTitle());
	}

	@Test
	public void shouldInjectConstructorArgumentReferencesByIndex() {
		CDPlayer player = context.getBean("player2", CDPlayer.class);
		assertTrue(player.getOutput() instanceof Speakers);
		assertEquals("Slippery When Wet", player.getDisc().getTitle());
	}

	@Test
	public void shouldInjectSimpleConstructorReference() {
		Radio radio = context.getBean(Radio.class);
		assertTrue(radio.getOutput() instanceof Speakers);
	}
}
