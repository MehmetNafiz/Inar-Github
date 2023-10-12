package week_07.assignments;

import java.util.Scanner;

public class Question_07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int greatestCommonDivisor;
        int minNumber;
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        minNumber = getMinNumber(numbers);
        greatestCommonDivisor = getGreatestCommonDivisor(numbers, minNumber);

        System.out.println("The greatest common divisor is " + greatestCommonDivisor);
    }

    private static int getMinNumber(int[] numbers) {
        int minNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < minNumber)
                minNumber = numbers[i];
        }
        return minNumber;
    }

    private static int getGreatestCommonDivisor(int[] numbers, int minNumber) {
        int greatestCoomonDivisor = 1;
        boolean isCommonDivisor;
        for (int divisor = 2; divisor <= minNumber; divisor++) {
            isCommonDivisor = true;
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % divisor != 0)
                    isCommonDivisor = false;

            }
            if(isCommonDivisor)
                greatestCoomonDivisor = divisor;
        }
        return greatestCoomonDivisor;
    }
}
