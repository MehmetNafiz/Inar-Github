package week_05.assigments;

import java.util.Scanner;

public class Question_05_42 {
    public static void main(String[] args) {
        double commision = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the commission sought:");
        int commissionSought = input.nextInt();


        for (double sales = 0; sales < 1_000_000.0f; sales += 0.01f) {
            commision = 0;
            if (sales <= 5_000)
                commision += sales * 0.08;
            else if (sales <= 10_000)
                commision += 5000 * 0.08 + (sales - 5000) * 0.10;
            else
                commision += 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;

            if (commision >= commissionSought) {
                System.out.printf("Minimum sales to earn $%d: $%.0f", commissionSought, sales);
                break;
            }
        }
    }
}
