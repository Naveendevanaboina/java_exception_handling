package com.neoteric.loan;


public abstract class LoanApplication {

    public final void processLoan(String customerName, double loanAmount, double salary, int creditScore, PaymentService paymentService) {
        try {
            System.out.println("Processing loan for " + customerName);

            validateInputs(loanAmount, salary, creditScore);

            if (checkEligibility(salary, creditScore)) {
                double emi = calculateEMI(loanAmount);

                boolean approved = approveLoan(salary, creditScore, loanAmount);

                if (approved) {
                    LoanDetails loanDetails = new LoanDetails(customerName, loanAmount, emi);
                    System.out.println("Loan Approved: " + loanDetails);


                    paymentService.makePayment(customerName, emi);


                    TransactionDetails txn = new TransactionDetails(customerName, emi, paymentService.getClass().getSimpleName());
                    System.out.println(" Transaction Done: " + txn);

                } else {
                    throw new LoanEligibilityException("Loan Rejected by Bank Policy for " + customerName);
                }
            } else {
                throw new LoanEligibilityException("Loan Rejected (Eligibility Failed) for " + customerName);
            }
        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }
        System.out.println("-----------------------------------");
    }

    private void validateInputs(double loanAmount, double salary, int creditScore)
            throws InvalidLoanAmountException, InvalidSalaryException, InvalidCreditScoreException {

        if (loanAmount <= 0) {
            throw new InvalidLoanAmountException("Loan amount must be greater than 0");
        }
        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than 0");
        }
        if (creditScore < 300 || creditScore > 900) {
            throw new InvalidCreditScoreException("Credit score must be between 300 and 900");
        }
    }

    protected double calculateEMI(double loanAmount) {
        double rate = 0.10;
        int tenure = 12;
        return (loanAmount * rate) / tenure;
    }

    protected abstract boolean checkEligibility(double salary, int creditScore);
    protected abstract boolean approveLoan(double salary, int creditScore, double loanAmount);
}
