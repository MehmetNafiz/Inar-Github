package week_07.assignments;

import java.util.Scanner;

public class Question_07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] listOfNumbers = new int[10];

        System.out.println("Enter ten numbers:");
        for (int i = 0; i < listOfNumbers.length; i++) {
            listOfNumbers[i] = input.nextInt();
        }

        listOfNumbers = reverse(listOfNumbers);
        displayList(listOfNumbers);
    }

    public static int[] reverse(int[] list){
        int tempt;

        for (int i = 0; i <= list.length / 2; i++) {
            tempt = list[i];
            list[i] = list[9-i];
            list[9-i] = tempt;
        }
        return list;
    }

    public static void displayList(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
