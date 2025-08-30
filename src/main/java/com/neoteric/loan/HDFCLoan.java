package com.neoteric.loan;

public class HDFCLoan extends LoanApplication {

    @Override
    protected boolean checkEligibility(double salary, int creditScore) {
        return salary > 30000 && creditScore > 650;
    }

    @Override
    protected boolean approveLoan(double salary, int creditScore, double loanAmount) {
        return loanAmount <= salary * 20;
    }
}
