package com.neoteric.bookmyshow;

public class Order {
    private String orderId;
    private double amount;
    private int numberOfTickets;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Order(String orderId, double amount, int numberOfTickets) {
        this.orderId = orderId;
        this.amount = amount;
        this.numberOfTickets = numberOfTickets;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}