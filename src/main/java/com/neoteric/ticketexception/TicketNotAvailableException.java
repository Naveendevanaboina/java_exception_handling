package com.neoteric.ticketexception;


public class TicketNotAvailableException extends Exception {
    public TicketNotAvailableException(String message) {
        super(message);
    }
}
