package week_07.assignments;

import java.util.Scanner;

public class Question_07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int[] list = new int[50];
        System.out.println("Enter the integers between 1 and 100, (enter a negative number for quit):");
        int number = input.nextInt();

        while (number >= 0 && number <= 100 ){
            list[counter] = number;
            number = input.nextInt();
            counter++;
        }

        if(counter == 0)
            System.out.println("No score was inputted");
        else{
            double average = computeAverage(list);
            printAnalyze(list, average);
        }

    }

    private static double computeAverage(int[] list) {
        int sum = 0;
        int counter = 0;

        while (list[counter] != 0){
            sum += list[counter];
            counter++;
        }
        return sum / counter;


    }

    private static void printAnalyze(int[] list, double average) {
        int countOfBelowAverage = 0;
        int countOfAboveAverage = 0;
        int countOfEquals = 0;
        int index = 0;

        while (list[index] != 0){
            if (list[index] < average)
                countOfBelowAverage++;
            else if (list[index] > average)
                countOfAboveAverage++;
            else
                countOfEquals++;

            index++;
        }
        System.out.println("Count of the Numbers Above the Average is " + countOfAboveAverage);
        System.out.println("Count of the Numbers Below the Average is " + countOfBelowAverage);
        System.out.println("Count of the Numbers Equals the Average is " + countOfEquals);

    }
}
