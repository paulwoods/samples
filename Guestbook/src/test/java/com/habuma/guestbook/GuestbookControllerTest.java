package com.habuma.guestbook;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.server.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.server.result.MockMvcResultActions.*;
import static org.springframework.test.web.server.setup.MockMvcBuilders.*;

import java.util.ArrayList;

import org.junit.Test;

public class GuestbookControllerTest {

	@Test
	public void listGuests() throws Exception {
		GuestRepository guestRepository = mock(GuestRepository.class);
		when(guestRepository.getAllGuests()).thenReturn(new ArrayList<Guest>());
		standaloneSetup(new GuestbookController(guestRepository))
				.build()
				.perform(get("/"))
				.andExpect(response().status().isOk())
				.andExpect(model().hasAttributes("guest", "guests"))
				.andExpect(model().attribute("guests", new ArrayList<Guest>()));
	}
	
}
