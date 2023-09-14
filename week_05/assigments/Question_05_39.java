package week_05.assigments;

import java.util.Scanner;

public class Question_05_39 {
    public static void main(String[] args) {
        double sales = 0;
        double commision = 0;

        while (commision < 25000){
            commision = 0;
            if (sales <= 5_000)
                commision += sales * 0.08;
            else if (sales <= 10_000)
                commision += 5000 * 0.08 + (sales - 5000) * 0.10;
            else
                commision += 5000 * 0.08 + 5000 * 0.10 + (sales - 10000) * 0.12;

            sales +=0.01;
        }
        System.out.printf("Minimum sales to earn $30000 : %.2f", sales);

    }
}
