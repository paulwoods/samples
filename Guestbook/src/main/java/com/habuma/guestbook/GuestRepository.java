package com.habuma.guestbook;

import java.util.List;

public interface GuestRepository {

	void addGuest(Guest guest);
	
	List<Guest> getAllGuests();

}