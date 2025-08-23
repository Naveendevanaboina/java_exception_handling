package com.neoteric.ticketexception;


import java.util.Scanner;

public class TicketBookingTest {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            try {
                ticketService.bookTicket(name, "Avengers");
            } catch (TicketNotAvailableException e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }

        sc.close();
    }
}

