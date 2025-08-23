package com.neoteric.ticketexception;



public class TicketService {
    private int totalSeats = 100;
    private int bookedSeats = 98;

    public Ticket bookTicket(String customerName, String movieName) throws TicketNotAvailableException {
        int availableSeats = totalSeats - bookedSeats;

        if (availableSeats <= 0) {
            throw new TicketNotAvailableException("Sorry " + customerName + ", no seats available for " + movieName);
        }

        bookedSeats++;
        String ticketId = "TCK" + System.currentTimeMillis();

        Ticket ticket = new Ticket(ticketId, customerName, movieName, bookedSeats);

        System.out.println(" Ticket booked: " + ticket);
        System.out.println("Remaining Seats: " + (totalSeats - bookedSeats));

        return ticket;
    }
}
