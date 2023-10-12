package week_07.assignments;

import java.util.Scanner;

public class Question_07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] listOfDoubles = new double[10];
        double[] sortedList;
        for (int i = 0; i < listOfDoubles.length; i++) {
            listOfDoubles[i] = input.nextDouble();
        }

        sortedList = sortList(listOfDoubles);
        displayList(sortedList);
    }

    public static double[] sortList(double[] list) {
        for (int i = list.length - 1; i > 0 ; i--) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (list[i] < list[j]) {
                    double tempt = list[i];
                    list[i] = list[j];
                    list[j] = tempt;
                }
            }
        }
        return list;
    }

    public static void displayList(double[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
