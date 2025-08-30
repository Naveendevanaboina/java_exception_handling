package com.neoteric.bookmyshow;

import java.util.Date;

public class Ticket {

    private  int bookindgId;
     private  String status;
     private Date bookingDate;

    public Ticket(int bookindgId, String status, Date bookingDate) {
        this.bookindgId = bookindgId;
        this.status = status;
        this.bookingDate = bookingDate;
    }

    public Ticket(String orderId, String confirmed) {
    }

    public int getBookindgId() {
        return bookindgId;
    }

    public void setBookindgId(int bookindgId) {
        this.bookindgId = bookindgId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
