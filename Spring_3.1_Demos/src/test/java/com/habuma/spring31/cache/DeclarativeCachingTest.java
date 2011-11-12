package com.habuma.spring31.cache;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/habuma/spring31/cache/caching.xml")
public class DeclarativeCachingTest {
	@Autowired
	private Translator translator;
	
	@Test
	@Ignore
	public void cacheTest() {
		System.out.println(translator.translate(0));
		System.out.println(translator.translate(9));
		System.out.println(translator.translate(10));
		System.out.println(translator.translate(15));
		System.out.println(translator.translate(16));
		System.out.println(translator.translate(19));
		System.out.println(translator.translate(19));
		System.out.println(translator.translate(36));
		for (int i = 0; i < 100; i++) {
			System.out.println(translator.translate(51));
		}
		
		System.out.println("The translator was called " + translator.getCallCount() + " times");
	}
}
