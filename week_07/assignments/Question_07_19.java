package week_07.assignments;

import java.util.Scanner;

public class Question_07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int[] listOfNumber = new int[15];
        int counter = 0;

        System.out.println("Enter integers; for quit enter a negative number");
        while(true){
            number = input.nextInt();
            if ((number < 0))
                break;
            listOfNumber[counter] = number;
            counter++;
        }

        if(isSorted(listOfNumber))
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");

    }

    private static boolean isSorted(int[] listOfNumber) {
        boolean isSorted = true;
        int index = 0;

            while(listOfNumber[index + 1] != 0){
            if(listOfNumber[index] > listOfNumber[index + 1])
                isSorted = false;
            index++;
        }
        return isSorted;
    }
}
