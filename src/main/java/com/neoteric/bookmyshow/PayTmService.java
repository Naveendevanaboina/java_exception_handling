package com.neoteric.bookmyshow;


import java.util.UUID;

public class PayTmService extends TicketBookingTemple {

    @Override
    public Order createOrder(int numberOfTickets, double amount) {
        System.out.println("[PayTm] Creating PayTm order for " + numberOfTickets + " tickets with amount " + amount);
        String paytmOrderId = "PAYTM-" + UUID.randomUUID().toString().substring(0, 8);
        Order order = new Order(paytmOrderId, amount, numberOfTickets);
        System.out.println("[PayTm] Order Created with id " + order.getOrderId());
        return order;
    }

    @Override
    public void makePayment(String orderId, double amount) {
        System.out.println("[PayTm] Payment of " + amount + " done via PayTm Wallet for Order: " + orderId);
    }

    @Override
    public Ticket confirm(Order order) {
        System.out.println("[PayTm] Ticket confirmed for Order ID: " + order.getOrderId());
        return new Ticket(order.getOrderId(), "Confirmed");
    }
}
