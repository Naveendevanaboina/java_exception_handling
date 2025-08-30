package com.neoteric.loan;

public class InvalidLoanAmountException extends Exception {
    public InvalidLoanAmountException(String message) {
        super(message);
    }
}
