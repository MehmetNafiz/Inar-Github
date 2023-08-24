package week_03.assigments;

import java.util.Scanner;

public class Question_03_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight and price for package 1:");
        int weight1 = input.nextInt();
        double price1 = input.nextDouble();

        System.out.println("Enter weight and price for package 2:");
        int weight2 = input.nextInt();
        double price2 = input.nextDouble();

        if(weight1/price1 > weight2/price2)
            System.out.println("Package 2 has better price.");
        else if(weight1/price1 < weight2/price2)
            System.out.println("Package 1 has better price.");
        else
            System.out.println("Two packages have the same price.");
    }
}
