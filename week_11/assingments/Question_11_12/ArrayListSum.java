package week_11.assingments.Question_11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextDouble());
        }
        System.out.println("Sum = " + sum(list));

        in.close();
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
