package com.app.ticket.booking.model;

public class TicketDetailsResponse {
	private String source;
	private String destination;
	private String fightNumber;
	private Long availableCount;

	private TicketDetailsResponse(Builder builder) {
		this.source = builder.source;
		destination = builder.destination;
		fightNumber = builder.fightNumber;
		availableCount = builder.availableCount;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public String getFightNumber() {
		return fightNumber;
	}

	public Long getAvailableCount() {
		return availableCount;
	}

	public static class Builder {
		private String source;
		private String destination;
		private String fightNumber;
		private Long availableCount;

		public Builder withSource(String source) {
			this.source = source;
			return this;
		}

		public Builder withDestination(String destination) {
			this.destination = destination;
			return this;
		}

		public Builder withFlightNumber(String fightNumber) {
			this.fightNumber = fightNumber;
			return this;
		}

		public Builder withAvailableCount(Long availableCount) {
			this.availableCount = availableCount;
			return this;
		}

		public TicketDetailsResponse build() {
			return new TicketDetailsResponse(this);
		}

	}
}
