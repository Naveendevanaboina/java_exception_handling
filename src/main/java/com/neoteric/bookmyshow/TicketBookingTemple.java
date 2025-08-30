package com.neoteric.bookmyshow;

import java.util.UUID;

import java.util.UUID;

// Abstract class (Template)
public abstract class TicketBookingTemple {

    // Template method (defines steps of booking a ticket)
    public final Ticket bookTicket(int numberOfTickets, double price) {
        double ticketPrice = numberOfTickets * price;

        Order order = createOrder(numberOfTickets, ticketPrice);

        double tax = calculateTax(ticketPrice);

        makePayment(order.getOrderId(), ticketPrice + tax);

        return confirm(order);
    }

    // Step 1 - Create Order (fixed implementation)
    public Order createOrder(int numberOfTickets, double amount) {
        System.out.println("Create order in PayTm");
        return new Order(UUID.randomUUID().toString(),amount,numberOfTickets);
    }

    // Step 2 - Calculate Tax (hook method - can be overridden)
    public double calculateTax(double price) {
        double tax = price * 0.18;
        System.out.println("Tax calculated " + tax);
        return tax;
    }

    // Step 3 - Abstract: Payment must be defined by subclasses
    public abstract void makePayment(String orderId, double amount);

    // Step 4 - Abstract: Confirmation handled by subclasses
    public abstract Ticket confirm(Order order);
}
