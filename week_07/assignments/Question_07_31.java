package week_07.assignments;

import java.util.Scanner;

public class Question_07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list1;
        int[] list2;
        int[] mergedList;

        System.out.println("Enter list1:");
        int firstNumberOfList1 = input.nextInt();
        list1 = fillList(firstNumberOfList1);

        System.out.println("Enter list2:");
        int firstNumberOfList2 = input.nextInt();
        list2 = fillList(firstNumberOfList2);

        mergedList = merge(list1, list2);
        displayList(mergedList);

    }

    private static void displayList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
    }

    private static int[] merge(int[] list1, int[] list2) {
        int counter = 0;
        int counterOfList1 = 0;
        int counterOfList2 = 0;
        int[] mergedList = new int[list1.length + list2.length];

        while( counter < list1.length + list2.length){
            int listChooser = (int)(Math.random() * 2);
            int currentNumber;

            if(listChooser == 0 && counterOfList1 < list1.length)
                while (true){
                    currentNumber = list1[(int)(Math.random() * list1.length)];
                    if (currentNumber != 0){
                        mergedList[counter] = currentNumber;
                        counter++;
                        counterOfList1++;
                        break;
                    }
                }

            if(listChooser == 1 && counterOfList2 < list2.length)
                while (true) {
                    currentNumber = list2[(int) (Math.random() * list2.length)];
                    if (currentNumber != 0) {
                        mergedList[counter] = currentNumber;
                        counter++;
                        counterOfList2++;
                        break;
                    }
                }
        }
        return mergedList;
    }

    public static int[] fillList(int firstNumber) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[firstNumber];

        list[0] = firstNumber;
        for (int i = 1; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
}
