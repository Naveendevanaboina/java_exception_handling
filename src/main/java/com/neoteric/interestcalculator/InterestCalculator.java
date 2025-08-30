package com.neoteric.interestcalculator;


import java.util.Scanner;

public class InterestCalculator {


        public static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }


        public static double calculateCompoundInterest(double principal, double rate, double time) {
            return principal * (Math.pow((1 + rate / 100), time)) - principal;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter Principal Amount: ");
            double principal = sc.nextDouble();

            System.out.print("Enter Rate of Interest (per year %): ");
            double rate = sc.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = sc.nextDouble();


            double simpleInterest = calculateSimpleInterest(principal, rate, time);
            System.out.println("Simple Interest = " + simpleInterest);


            double compoundInterest = calculateCompoundInterest(principal, rate, time);
            System.out.println("Compound Interest = " + compoundInterest);

            sc.close();
        }
    }


