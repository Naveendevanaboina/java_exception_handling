package com.neoteric.order;


public class PaymentService {

    private double accountBalance = 1000.0;

    public Payment makePayment(double amount, String method, String orderId)
            throws InvalidPaymentException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidPaymentException("Amount must be greater than zero!");
        }
        if (method == null || method.isEmpty()) {
            throw new InvalidPaymentException("Payment method is required!");
        }
        if (amount > accountBalance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: " + accountBalance);
        }


        accountBalance -= amount;

        String txnId = "TXN" + System.currentTimeMillis();
        Payment payment = new Payment(amount, method, txnId, orderId);

        System.out.println("Payment Successful | Amount: " + amount +
                " | Method: " + method + " | TxnId: " + txnId +
                " | Remaining Balance: " + accountBalance);
        return payment;
    }
}
