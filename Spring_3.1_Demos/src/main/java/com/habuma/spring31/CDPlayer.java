package com.habuma.spring31;


public class CDPlayer {
	private final CompactDisc disc;
	private final OutputDevice output;

	public CDPlayer(CompactDisc disc, OutputDevice output) {
		this.disc = disc;
		this.output = output;
	}

	public CompactDisc getDisc() {
		return disc;
	}

	public OutputDevice getOutput() {
		return output;
	}

}
