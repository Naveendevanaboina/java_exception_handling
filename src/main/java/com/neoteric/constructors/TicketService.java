package com.neoteric.constructors;

import java.util.UUID;

public class TicketService {

    public Ticket createTicket(Ticket ticket){


       String pnr =  UUID.randomUUID().toString();

        Ticket bookedTicket= new Ticket(
                pnr,
                ticket.getName(),
                ticket.getServiceNumber(),
                ticket.getSeatSelections());
        return  bookedTicket;
    }

}
