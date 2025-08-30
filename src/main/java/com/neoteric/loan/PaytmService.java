package com.neoteric.loan;
public class PaytmService implements PaymentService {
    @Override
    public void makePayment(String customerName, double amount) {
        System.out.println(" EMI of " + amount + " paid via Paytm by " + customerName);
    }
}
