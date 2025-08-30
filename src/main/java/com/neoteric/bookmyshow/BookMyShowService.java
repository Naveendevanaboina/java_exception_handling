package com.neoteric.bookmyshow;



import java.util.UUID;

public class BookMyShowService extends TicketBookingTemple {

    @Override
    public Order createOrder(int numberOfTickets, double amount) {
        System.out.println("Create order in BookMyShow");
        return new Order(UUID.randomUUID().toString(),amount,numberOfTickets);

    }

    @Override
    public void makePayment(String orderId, double amount) {
        System.out.println(" [BookMyShow] Payment of " + amount + " done using BookMyShow Wallet for Order: " + orderId);
    }

    @Override
    public Ticket confirm(Order order) {
        System.out.println("[BookMyShow] Ticket confirmed for Order ID: " + order.getOrderId());
        return new Ticket(order.getOrderId(), "Confirmed");
    }
}
