package week_11.assingments.Question_11_03;

import week_09.assignments.Question_09_07.Account;

public class SavingsAccount extends Account {

    public double minBalance;

    public SavingsAccount() {

        this.minBalance = 0;

    }

    public SavingsAccount(int id, double newBalance) {
        super(id, newBalance);
        this.minBalance = 0;
    }

    @Override
    public void withdraw(double amount) {

        if (this.getBalance() - amount < minBalance) {
            System.out.println("We cannot complete this transaction. \nIt will put you over your withdrawl limit.");
        } else {
            this.setBalance(this.getBalance() - amount);
        }
    }

    @Override
    public String toString() {

        return super.toString() + "\nOverdraft protection not included";
    }
}

