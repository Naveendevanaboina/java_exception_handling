package com.neoteric.insurance;

public class HDFCInsurance implements InsuranceCompany {
    @Override
    public InsurancePolicy createPolicy(String customerName, String plan) throws InvalidPlanException {
        double baseAmount;

        if (plan.equalsIgnoreCase("Basic")) {
            baseAmount = 6000;
        } else if (plan.equalsIgnoreCase("Premium")) {
            baseAmount = 12000;
        } else {
            throw new InvalidPlanException("Invalid plan for HDFC. Choose Basic or Premium.");
        }

        double percentage = 0.18;
        double finalAmount = calculatePremiumWithCharges(baseAmount);

        return new InsurancePolicy("HDFC" + System.currentTimeMillis(),
                customerName, "HDFC Life Insurance", baseAmount, percentage, finalAmount);
    }

    @Override
    public double calculatePremiumWithCharges(double baseAmount) {
        return baseAmount + (baseAmount * 0.18);
    }
}
