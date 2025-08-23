package com.neoteric.order;

import java.util.Date;

public class Payment {
    private double amount;
    private String method;
    private  String transactionId;
    private String orderId;
    private Date paymentDate;

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Payment(double amount, String method, String transactionId, String orderId) {
        this.amount = amount;
        this.method = method;
        this.transactionId = transactionId;
        this.orderId = orderId;
    }
}
