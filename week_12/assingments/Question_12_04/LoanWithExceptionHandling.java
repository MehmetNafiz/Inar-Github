package week_12.assingments.Question_12_04;

import java.util.Date;

public class LoanWithExceptionHandling {
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmount;
    private java.util.Date loanDate;


    public LoanWithExceptionHandling(double annualInterestRate, int numberOfYear, double loanAmount) {
        setAnnualInterestRate(annualInterestRate);
        setNumberOfYear(numberOfYear);
        setLoanAmount(loanAmount);
        loanDate = new Date();
    }

    public LoanWithExceptionHandling() {
        this(2.5, 1, 1000);
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12)));
        return monthlyPayment;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if(annualInterestRate <= 0)
            throw new IllegalArgumentException();
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        if(numberOfYear <= 0)
            throw new IllegalArgumentException();
        this.numberOfYear = numberOfYear;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if(loanAmount <= 0)
            throw new IllegalArgumentException();
        this.loanAmount = loanAmount;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYear * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
