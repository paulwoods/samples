package com.habuma.spring31.cache;

public interface Translator {

	String translate(int number);

	int getCallCount();
	
}