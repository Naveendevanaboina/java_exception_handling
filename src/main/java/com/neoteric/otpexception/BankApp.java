package com.neoteric.otpexception;


public class BankApp {
    public static void main(String[] args) {
        BankService account = new BankService();

        int enteredPin = 1234;


        double withdrawAmount = 5000;


        try {
            account.validatePin(enteredPin);
            account.withdraw(withdrawAmount);
        }
        catch (InvalidPinException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("🔒 Transaction Process Completed.");
        }
    }
}
