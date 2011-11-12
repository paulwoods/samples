package com.habuma.spring31;

public class Radio {
	private final OutputDevice output;

	public Radio(OutputDevice output) {
		this.output = output;
	}

	public OutputDevice getOutput() {
		return output;
	}
}
