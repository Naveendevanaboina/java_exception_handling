package com.neoteric.loan;

import java.time.LocalDateTime;
import java.util.UUID;

public class TransactionDetails {
    private String transactionId;
    private String customerName;
    private double amount;
    private String paymentMode;
    private LocalDateTime transactionDateTime;

    public TransactionDetails(String customerName, double amount, String paymentMode) {
        this.transactionId = "TXN-" + UUID.randomUUID().toString().substring(0, 8);
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.transactionDateTime = LocalDateTime.now();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    @Override
    public String toString() {
        return "TransactionDetails{" +
                "transactionId='" + transactionId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", paymentMode='" + paymentMode + '\'' +
                ", transactionDateTime=" + transactionDateTime +
                '}';
    }
}
