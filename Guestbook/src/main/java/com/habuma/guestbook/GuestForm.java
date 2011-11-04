package com.habuma.guestbook;

import java.util.Date;

public class GuestForm {
	private String name;
	private String email;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	Guest toGuest() {
		return new Guest(name, email, new Date());
	}
}
