package com.neoteric.insurance;

public class PaymentService {
    private double balance = 50000.0;

    public Payment makePayment(double amount, String method) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance! Available: " + balance);
        }
        balance -= amount;
        String txnId = "TXN" + System.currentTimeMillis();
        return new Payment(txnId, amount, method);
    }

    public double getBalance() {
        return balance;
    }
}
