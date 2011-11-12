package com.habuma.spring31.cache;


public class SlowTranslator implements Translator {
	private static final String[] ONES = {"cero", "uno", "dos", "tres", "quatro", "cinco", "seis", "siete", "ocho", "nueve"};
	
	private static final String[] LOW_TEENS = {"diez", "once", "doce", "trece", "catorce", "quince"};
	
	private static final String[] TENS = {"", "diez", "veinta", "trecenta", "cuarenta", "cinquenta", "sesenta", "setenta", "ochenta", "noventa" };
	
	private int callCount = 0;

	/*
	 	A few @Cacheable things you might want to try out:
	 	
	 	@Cacheable("translator")
	 	@Cacheable(value="translator", key="#root.methodName")
	 	@Cacheable(value="translator", key="#root.methodName+'::'+#number")
	 	@Cacheable(value="translator", condition="#number > 20")
	 	@Cacheable(value="translator", condition="#p0 > 20")
	 	@CacheEvict(value="translator", condition="(#number % 2) == 0")
	 	@CacheEvict(value="translator", condition="(#number % 2) == 0", allEntries=true)
	 */
	public String translate(int number) {
		callCount++;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		if(number > 99 || number < 0) {
			throw new IllegalArgumentException("Only numbers between 0 and 99 supported");
		}
		
		if(number < 10) {
			return ONES[number];
		}
		
		if(number < 16) {
			return LOW_TEENS[number - 10];
		}
		
		return TENS[number / 10] + ((number % 10 > 0) ? " y " + ONES[number % 10] : "");
	}
	
	public int getCallCount() {
		return callCount;
	}
}
