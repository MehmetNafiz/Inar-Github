package week_04.assigments;

import java.util.Scanner;
public class Question_04_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String amount = input.nextLine();
        int dot =amount.indexOf(",");
        int numberOfOneDollars = Integer.parseInt(amount.substring(0,dot));
        int remain = Integer.parseInt(amount.substring(dot+1));

        int numberOfQuarters = remain / 25;
        remain = remain % 25;
        int numberOfDimes = remain / 10;
        remain = remain % 10;
        int numberOfNickels = remain / 5;
        remain = remain % 5;
        int numberOfPennies = remain;
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
