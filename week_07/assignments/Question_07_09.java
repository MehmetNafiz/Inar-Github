package week_07.assignments;

import java.util.Scanner;

public class Question_07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] doubleList = new double[10];

        System.out.println("Enter 10 double numbers");
        for (int i = 0; i < doubleList.length; i++) {
            doubleList[i] = input.nextDouble();
        }

        double minNumber = minFinder(doubleList);
        System.out.println("The minimum number is: " + minNumber);
    }

    private static double minFinder(double[] doubleList) {
        double min = doubleList[0];
        for (int i = 0; i < doubleList.length; i++) {
            if(doubleList[i] < min)
                min = doubleList[i];
        }
        return min;
    }
}
