package week_11.assingments.Question_11_08;

import java.util.Date;

public class Transaction {

    public static final char WITHDRAWL = 'W';
    public static final char DEPOSIT = 'D';
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date transactionDate;


    public Transaction(char type, double amount, double balance, String description) {
        this.transactionDate = new Date();
        this.amount = amount;
        this.balance = balance;
        this.type = type;
        this.description = description;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public Transaction setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
        return this;
    }

    public char getType() {
        return type;
    }

    public Transaction setType(char type) {
        this.type = type;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Transaction setAmount(double amount) {
        this.amount = amount;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public Transaction setBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Transaction setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return "\nTransaction:\n" +
                "type=" + type +
                ", amount=$" + amount +
                ", balance=$" + balance +
                ", description='" + description + '\'' +
                ", transactionDate=" + transactionDate;
    }
}

