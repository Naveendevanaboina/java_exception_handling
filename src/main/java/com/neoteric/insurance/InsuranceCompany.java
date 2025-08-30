package com.neoteric.insurance;

public interface InsuranceCompany {
    InsurancePolicy createPolicy(String customerName, String plan) throws InvalidPlanException;
    double calculatePremiumWithCharges(double baseAmount);
}
