package week_11.assingments.Question_11_03;

import week_09.assignments.Question_09_07.Account;

public class AccountTest {
    public static void main(String[] args) {

        Account testAcct = new Account(1, 100);

        SavingsAccount testSaves = new SavingsAccount(5,100);

        CheckingAccount testCheck = new CheckingAccount(3, 1000);

        System.out.println(testAcct.toString());
        System.out.println(testSaves.toString());
        System.out.println(testCheck.toString());
    }
}
