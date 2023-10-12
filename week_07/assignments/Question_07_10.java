package week_07.assignments;

import java.util.Scanner;

public class Question_07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] listOfNumber = new double[10];

        System.out.println("Enter ten integers:");
        for (int i = 0; i < listOfNumber.length; i++) {
            listOfNumber[i] = input.nextDouble();
        }

        System.out.println("Index of the smallest number is " + indexOfSmallestElement(listOfNumber));
    }

    private static int indexOfSmallestElement(double[] listOfNumber) {
        int indexOfMin = 0;
        double min = listOfNumber[0];
        for (int i = 0; i < listOfNumber.length; i++) {
            if (min > listOfNumber[i]){
                min = listOfNumber[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
