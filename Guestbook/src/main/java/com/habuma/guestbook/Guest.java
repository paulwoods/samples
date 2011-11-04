package com.habuma.guestbook;

import java.util.Date;

public class Guest {
	
	private String name;
	private String email;
	private Date dateOfVisit;
	
	public Guest(String name, String email, Date dateOfVisit) {
		this.name = name;
		this.email = email;
		this.dateOfVisit = dateOfVisit;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Date getDateOfVisit() {
		return dateOfVisit;
	}
	
}
