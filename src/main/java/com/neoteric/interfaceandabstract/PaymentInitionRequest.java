package com.neoteric.interfaceandabstract;

public class PaymentInitionRequest {

    String bookingId;
    double amount;
    String merchantId;

    public String getBookingId() {
        return bookingId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public PaymentInitionRequest(String bookingId, double amount, String merchantId) {
        this.bookingId = bookingId;
        this.amount = amount;
        this.merchantId = merchantId;
    }


}
