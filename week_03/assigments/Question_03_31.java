package week_03.assigments;
import java.util.Scanner;
public class Question_03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB:");
        double exchangeRate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
        int exchangeType = input.nextInt();

        double amount;

        if (exchangeType == 0) {
            System.out.println("Enter the dollar amount:");
            amount = input.nextDouble();
            System.out.println("$" + amount + " is " + amount*exchangeRate + " yuan" );
        }
        else if (exchangeType == 1){
            System.out.println("Enter the RMB amount:");
            amount = input.nextDouble();
            System.out.println(amount + " yuan is $"+amount/exchangeRate);
        }
    }
}
