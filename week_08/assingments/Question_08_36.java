package week_08.assingments;

import java.util.Scanner;

public class Question_08_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number n:");
        int numberOfN = input.nextInt();

        char[][] array = new char[numberOfN][numberOfN];

        fillArray(array);

        analyzeArray(array);
    }

    private static void analyzeArray(char[][] array) {
        int total = (array.length - 1) * (array.length) / 2;
        boolean isLatin = true;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += (int) (array[i][j]) - 'A';
            }
            if (sum != total)
                isLatin = false;
        }

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += (int) (array[j][i]) - 'A';
            }
            if (sum != total)
                isLatin = false;
        }

        if(isLatin)
            System.out.println("The input array is a Latin square");
        else
            System.out.println("The input array is not a Latin square");
    }

    private static void fillArray(char[][] array) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + array.length + " rows of letters seperated by spaces:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                String letter = input.next();
                array[i][j] = letter.charAt(0);

                if ((int) array[i][j] - 'A' >= array.length) {
                    System.out.println("Wrong input: The letter must be from A to " + (char) ('A' + array.length - 1));
                }
            }
        }
    }
}
