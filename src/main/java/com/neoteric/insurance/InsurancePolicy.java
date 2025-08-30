package com.neoteric.insurance;

public class InsurancePolicy {
    private String policyId;
    private String customerName;
    private String policyType;
    private double baseAmount;
    private double percentage;
    private double premiumAmount;

    public InsurancePolicy(String policyId, String customerName, String policyType,
                           double baseAmount, double percentage, double premiumAmount) {
        this.policyId = policyId;
        this.customerName = customerName;
        this.policyType = policyType;
        this.baseAmount = baseAmount;
        this.percentage = percentage;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "📝 InsurancePolicy {" +
                "policyId='" + policyId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", policyType='" + policyType + '\'' +
                ", baseAmount=" + baseAmount +
                ", percentage=" + (percentage * 100) + "%" +
                ", premiumAmount=" + premiumAmount +
                '}';
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }
}
