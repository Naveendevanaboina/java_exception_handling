package com.neoteric.otpexception;


public class BankService {
    private int pin = 1234;
    private double balance = 10000;


    public void validatePin(int enteredPin) throws InvalidPinException {
        if (enteredPin != pin) {
            throw new InvalidPinException("Invalid PIN entered!");
        } else {
            System.out.println("PIN Verified Successfully!");
        }
    }


    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance! Available: " + balance);
        } else {
            balance -= amount;
            System.out.println(" Withdrawal Successful! Remaining Balance: " + balance);
        }
    }
}
