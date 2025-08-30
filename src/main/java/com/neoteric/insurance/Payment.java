package com.neoteric.insurance;

import java.util.Date;

public class Payment {
    private String transactionId;
    private double amount;
    private String method;
    private Date date;

    public Payment(String transactionId, double amount, String method) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.method = method;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "💳 Payment{" +
                "txnId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", method='" + method + '\'' +
                ", date=" + date +
                '}';
    }
}
