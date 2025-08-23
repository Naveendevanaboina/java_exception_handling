package com.neoteric.otpexception;

// BankAccount.java
public class BankAccount {
    private int pin = 1234;        // Correct PIN
    private double balance = 5000; // Initial balance

    // Validate PIN
    public void validatePin(int enteredPin) throws InvalidPinException {
        if (enteredPin != pin) {
            throw new InvalidPinException("❌ Invalid PIN entered!");
        } else {
            System.out.println("✅ PIN Verified Successfully!");
        }
    }

    // Withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("❌ Insufficient Balance! Available: " + balance);
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawal Successful! Remaining Balance: " + balance);
        }
    }
}
