package week_05.live_class;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("           Multiplication Table");

        System.out.print("    ");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%3d ",i);
        }
        System.out.println("\n-----------------------------------------");


        for (int i = 1; i < 10; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <10 ; j++) {
                System.out.printf("%3d ",i * j);

            }
            System.out.println();
        }
    }
}
