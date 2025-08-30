package com.neoteric.interfaceandabstract;

import java.util.Date;

public class Transation {

    private  String transactionId;
    private double amount;
    private String status;
    private Date date;

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    public Transation(String transactionId, double amount, String status, Date date) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }
}
