package week_07.assignments;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int[] list = new int[50];
        int[] listOfNumber;
        System.out.println("Enter the integers between 1 and 100, ends with 0");
        int number = input.nextInt();

        while (number != 0) {
            list[counter] = number;
            number = input.nextInt();
            counter++;
        }

        listOfNumber = fillListOfNumbers(list);
        printOccurranceOfNumbers(list, listOfNumber);

    }

    private static int[] fillListOfNumbers(int[] list) {
        int counter = 0;
        int counter2 = 0;
        int[] listOfNumbers = new int[50];

        while (list[counter] != 0) {
            boolean flag = true;
            for (int i = 0; i < 50; i++) {
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

    private static void printOccurranceOfNumbers(int[] list, int[] listOfNumber) {
        int index = 0;
        while(listOfNumber[index] != 0){
            int counter = 0;
            for (int i = 0; i < list.length; i++) {
                if (listOfNumber[index] == list[i])
                    counter++;
            }
            if(counter == 1)
                System.out.println(listOfNumber[index] + " occurs 1 time");
            else if (counter >= 2)
                System.out.println(listOfNumber[index] + " occurs "  + counter + " times");
            index++;

        }

    }
}
