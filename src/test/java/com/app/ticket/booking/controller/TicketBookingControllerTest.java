package com.app.ticket.booking.controller;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.app.ticket.booking.model.TicketDetailsResponse;

@RunWith(SpringJUnit4ClassRunner.class)
public class TicketBookingControllerTest {

	@InjectMocks
	private TicketBookingController ticketBookingController;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAvailableTickets() {
		TicketDetailsResponse response = ticketBookingController.getAvailableTickets("Source1", "Destination1");
		Assert. assertEquals("Source1", response.getSource());
		Assert. assertEquals("Destination1", response.getDestination());
	}

}
