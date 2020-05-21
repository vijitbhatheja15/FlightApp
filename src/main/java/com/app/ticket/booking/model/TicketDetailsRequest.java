package com.app.ticket.booking.model;

public class TicketDetailsRequest {
	private String source;
	private String destination;
	
	public TicketDetailsRequest(){
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
