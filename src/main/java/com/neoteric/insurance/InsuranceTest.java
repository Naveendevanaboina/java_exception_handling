package com.neoteric.insurance;

import java.util.Scanner;

public class InsuranceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentService paymentService = new PaymentService();

        try {
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.println("Choose Company: ");
            System.out.println("1. TATA Insurance");
            System.out.println("2. HDFC Insurance");
            int companyChoice = sc.nextInt();
            sc.nextLine();

            InsuranceCompany company;
            if (companyChoice == 1) {
                company = new TATAInsurance();
            } else if (companyChoice == 2) {
                company = new HDFCInsurance();
            } else {
                throw new InvalidCompanyException(" Invalid company choice. Select 1 or 2.");
            }

            System.out.println("Choose Plan: ");
            System.out.println("1. Basic Plan");
            System.out.println("2. Premium Plan");
            int planChoice = sc.nextInt();
            sc.nextLine();

            String plan = (planChoice == 1) ? "Basic" : "Premium";

            // Create policy
            InsurancePolicy policy = company.createPolicy(name, plan);
            System.out.println("Policy Created: " + policy);

            // Payment
            System.out.print("Enter Payment Method (UPI/CARD): ");
            String method = sc.nextLine();

            Payment payment = paymentService.makePayment(policy.getPremiumAmount(), method);
            System.out.println(" Payment Done: " + payment +
                    " | Remaining Balance: " + paymentService.getBalance());

            System.out.println("🎉 Insurance Purchased Successfully!");

        } catch (InvalidPlanException | InvalidCompanyException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
