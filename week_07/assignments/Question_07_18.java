package week_07.assignments;

import java.util.Scanner;

public class Question_07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        double[] sortedArray;
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        sortedArray = bubbleSort(numbers);
        displayArray(sortedArray);
    }

    private static double[] bubbleSort(double[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if(list[j] > list[j + 1]){
                    double tempt = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tempt;
                }
            }
        }
        return list;
    }

    private static void displayArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
