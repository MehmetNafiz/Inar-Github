package week_09.assignments.Question_09_07;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    Date dateCreated;

    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        annualInterestRate = 0;
    }

    public int getID() {

        return id;
    }

    public void setID(int newID) {

        this.id = newID;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double newBalance) {

        this.balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newInterestRate) {

        this.annualInterestRate = newInterestRate;
    }

    public Date getDateCreated() {

        Date startDate = dateCreated;

        return startDate;
    }

    public double getMonthlyInterestRate() {

        double interestRatePerMonth = (annualInterestRate / 12);

        return interestRatePerMonth;
    }

    public double getMonthlyInterest() {

        double monthlyInterest = balance * (this.getMonthlyInterestRate() / 100);

        return monthlyInterest;
    }

    public void withdraw(double amount) {

        balance -= amount;
    }

    public void deposit(double amountDeposit) {

        balance += amountDeposit;

    }

    @Override
    public String toString() {

        return "Account ID: " + getID() + "Balance: " + getBalance() +
                "Date created " + getDateCreated();
    }


}
