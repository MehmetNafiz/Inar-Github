package week_05.assigments;

import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double standartDevition = 0;
        double sumOfNumber = 0;
        double sumOfNumberSpuare = 0;
        double mean = 0;
        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            double number = input.nextDouble();
            sumOfNumber += number;
            sumOfNumberSpuare+= Math.pow(number,2);
        }

        mean = sumOfNumber / 10;

        standartDevition = Math.sqrt((sumOfNumberSpuare - (Math.pow(sumOfNumber,2) / 10)) /9 );

        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standart deviation is %.5f", standartDevition);

    }
}
