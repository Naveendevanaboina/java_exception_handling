package com.neoteric.constructors;

import java.util.List;

public class BusTest {
    public static void main(String[] args) {
       SeatSelection s1 = new SeatSelection("A1", "Window", true);
       SeatSelection s2 = new SeatSelection("B1", "Aisle", false);

       Ticket ticket = new Ticket("naveen", "BUS456", List.of(s1, s2));

       TicketService ticketService = new TicketService();

       Ticket bookedTicket = ticketService.createTicket(ticket);

       System.out.println("createTicket hashcode      "+ ticket.hashCode());

       System.out.println("Ticket PNR: "+ bookedTicket.getPnr());
       System.out.println("Ticket Name: " + bookedTicket.getName());
       System.out.println("Service Number: " + bookedTicket.getServiceNumber());
       System.out.println("Seat Selections:"   + bookedTicket.getSeatSelections());
       System.out.println("Booked Ticket hashcode:      "+ bookedTicket.hashCode());

    }
}
