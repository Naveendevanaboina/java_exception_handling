package com.neoteric.ticketexception;


public class Ticket {
    private String ticketId;
    private String customerName;
    private String movieName;
    private int seatNumber;

    public Ticket(String ticketId, String customerName, String movieName, int seatNumber) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "🎟 Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", movieName='" + movieName + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
