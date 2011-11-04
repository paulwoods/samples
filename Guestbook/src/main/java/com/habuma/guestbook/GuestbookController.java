package com.habuma.guestbook;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GuestbookController {

	private final GuestRepository guestRepository;

	@Inject
	public GuestbookController(GuestRepository guestRepository) {
		this.guestRepository = guestRepository;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String listGuests(Model model) {
		model.addAttribute("guests", guestRepository.getAllGuests());
		model.addAttribute("guest", new GuestForm());
		return "guestbook";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String addGuest(GuestForm guest) {
		guestRepository.addGuest(guest.toGuest());
		return "redirect:/";
	}
	
}

