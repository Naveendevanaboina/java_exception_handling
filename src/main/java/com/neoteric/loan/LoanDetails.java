package com.neoteric.loan;


import java.time.LocalDateTime;
import java.util.UUID;

public class LoanDetails {
    private String loanNumber;
    private String customerName;
    private double loanAmount;
    private double emi;
    private LocalDateTime approvedDateTime;

    public LoanDetails(String customerName, double loanAmount, double emi) {
        this.loanNumber = "LN-" + UUID.randomUUID().toString().substring(0, 8);
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.emi = emi;
        this.approvedDateTime = LocalDateTime.now();
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public double getEmi() {
        return emi;
    }

    public LocalDateTime getApprovedDateTime() {
        return approvedDateTime;
    }

    @Override
    public String toString() {
        return "LoanDetails{" +
                "loanNumber='" + loanNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", loanAmount=" + loanAmount +
                ", emi=" + emi +
                ", approvedDateTime=" + approvedDateTime +
                '}';
    }
}
