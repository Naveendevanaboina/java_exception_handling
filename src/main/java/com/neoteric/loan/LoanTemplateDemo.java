package com.neoteric.loan;

import java.util.Scanner;

public class LoanTemplateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score (300-900): ");
        int creditScore = sc.nextInt();

        System.out.print("Choose Bank (1: HDFC, 2: SBI): ");
        int bankChoice = sc.nextInt();

        System.out.print("Choose Payment Service (1: Paytm, 2: GooglePay): ");
        int payChoice = sc.nextInt();

        LoanApplication loanApp;
        if (bankChoice == 1) {
            loanApp = new HDFCLoan();
        } else {
            loanApp = new SBILoan();
        }

        PaymentService paymentService;
        if (payChoice == 1) {
            paymentService = new PaytmService();
        } else {
            paymentService = new GooglePayService();
        }

        loanApp.processLoan(name, loanAmount, salary, creditScore, paymentService);

        sc.close();
    }
}
