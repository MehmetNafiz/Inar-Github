package week_07.assignments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] listOfNumbers = new double[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < listOfNumbers.length; i++) {
            listOfNumbers[i] = input.nextDouble();
        }
        double mean = mean(listOfNumbers);
        double deviation = deviation(listOfNumbers);

        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standart deviation is %.5f",deviation);
    }

    private static double mean(double[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / list.length;
    }

    private static double deviation(double[] list) {
        double sum = 0;
        double mean = 0;
        double deviation = 0;


        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        mean = sum / list.length;


        for (int i = 0; i < list.length; i++) {
            deviation += Math.pow((list[i] - mean),2);
        }
        deviation = Math.sqrt(deviation / (list.length - 1));

        return deviation;
    }

}
