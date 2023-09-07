package week_05.assigments;

import java.util.Scanner;

public class Question_05_01 {
    public static void main(String[] args) {
        double total = 0;
        int pozCount = 0;
        int negCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0:");
        int number = input.nextInt();

        while (number != 0){
            total += number;
            if(number < 0)
                negCount++;
            else
                pozCount++;
            number = input.nextInt();
        }

        System.out.printf("The number of positives is %d \n" +
                "The number of negatives is %d \n" +
                "The total is %.2f \n" +
                "The avarage is %.2f", pozCount, negCount, total, total/(negCount + pozCount) );

    }
}
