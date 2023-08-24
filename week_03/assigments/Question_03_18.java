package week_03.assigments;

import java.util.Scanner;

public class Question_03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of your package:");
        double weight = input.nextDouble();

        if ( weight > 0 && weight <= 1)
            System.out.println("Your price is $3.5");
        else if ( weight > 1 && weight <= 3)
            System.out.println("Your price is $5.5");
        else if ( weight > 3 && weight <= 10)
            System.out.println("Your price is $10");
        else if ( weight > 10 && weight <= 20)
            System.out.println("Your price is $20");
        else
            System.out.println("Sorry, your package is too heavy, we can't ship your package");

    }
}
