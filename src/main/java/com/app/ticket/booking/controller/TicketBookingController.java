package com.app.ticket.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.ticket.booking.model.TicketDetailsResponse;

@RestController
@RequestMapping("/api/experience")
public class TicketBookingController {

	@GetMapping(path = "/availableTickets")
	TicketDetailsResponse getAvailableTickets(@RequestParam("source") String source,
			@RequestParam("destination") String destination) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new TicketDetailsResponse.Builder().withSource(source).withDestination(destination).
				withAvailableCount(1000L).withFlightNumber("F1-ABCD").build();
	}
}
