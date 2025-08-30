package com.neoteric.loan;

public class GooglePayService implements PaymentService {
    @Override
    public void makePayment(String customerName, double amount) {
        System.out.println("EMI of " + amount + " paid via GooglePay by " + customerName);
    }
}
