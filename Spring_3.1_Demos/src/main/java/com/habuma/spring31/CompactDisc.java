package com.habuma.spring31;

public class CompactDisc {
	private final String title;
	private final String artist;

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public CompactDisc(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
}
