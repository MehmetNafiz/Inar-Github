package week_11.assingments.Question_11_07;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter a list of integers ending with 0: ");
        int number = input.nextInt();

        while (number != 0){
            list.add(number);
            number = input.nextInt();
        }

        System.out.println("Before shuffling...");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d  ", list.get(i));
        }

        System.out.println();

        shuffle(list);

        System.out.println("After shuffling...");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d  ", list.get(i));
        }
    }

    private static void shuffle(ArrayList<Integer> list) {
        for (int i = list.size(); i > 0; i--) {
            int currentIndex = (int)(Math.random() * i);
            int currentNumber = list.get(currentIndex);

            list.remove(currentIndex);
            list.add(currentNumber);
        }
    }
}
