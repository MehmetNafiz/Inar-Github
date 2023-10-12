package week_07.assignments;

import java.util.Scanner;

public class Question_07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] distinctNumbers;
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        distinctNumbers = eliminateDuplicates(numbers);
        displayArray(distinctNumbers);
    }

    private static int[] eliminateDuplicates(int[] numbers) {
        int[] distinctNumbers = new int[numbers.length];
            int index = 0;
            boolean isDistinct;
        for (int i = 0; i < numbers.length; i++) {
            isDistinct = true;

            for (int j = 0; j < distinctNumbers.length; j++) {
                if(numbers[i] == distinctNumbers[j])
                    isDistinct = false;
            }
            if(isDistinct)
                distinctNumbers[index++] = numbers[i];
        }
        return distinctNumbers;
    }

    private static void displayArray(int[] distinctNumbers) {
        int index = 0;
        while (distinctNumbers[index] != 0) {
            System.out.print(distinctNumbers[index++] + " ");
        }
    }
}
