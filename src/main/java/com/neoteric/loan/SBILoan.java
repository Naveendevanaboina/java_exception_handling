package com.neoteric.loan;

public class SBILoan extends LoanApplication {

    @Override
    protected boolean checkEligibility(double salary, int creditScore) {
        return salary > 25000 && creditScore > 600;
    }

    @Override
    protected boolean approveLoan(double salary, int creditScore, double loanAmount) {
        return loanAmount <= salary * 15;

    }
}
