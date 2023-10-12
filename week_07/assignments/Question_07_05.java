package week_07.assignments;

import java.util.Scanner;

public class Question_07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] listOfNumbers = new int[10];
        int[] listOfDistinctNumbers;

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            listOfNumbers[i] = input.nextInt();
        }

        listOfDistinctNumbers = computeDistinctNumber(listOfNumbers);
        displayList(listOfDistinctNumbers);
    }

    private static int[] computeDistinctNumber(int[] list) {
        int counter = 0;
        int counter2 = 0;
        int[] listOfNumbers = new int[10];

        while (counter < 10) {
            boolean flag = true;
            for (int i = 0; i < 10; i++) {
                if (list[counter] == listOfNumbers[i])
                    flag = false;
            }
            if (flag) {
                listOfNumbers[counter2] = list[counter];
                counter2++;
            }
            counter++;
        }
        return listOfNumbers;
    }

    private static void displayList(int[] list) {
        int counter = 0;

        while (list[counter] != 0)
            counter++;

        System.out.println("The number of distinct number is " + counter);

        for (int i = 0; i < counter; i++) {
            System.out.print(list[i] + " ");

        }

    }
}
