package week_10.assingments.Question_10_05;

import java.util.Scanner;

public class StackOfIntegersTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackOfIntegers stack1 = new StackOfIntegers();

        int[] primeFactors = new int[10];
        int numberOfPushedInteger = 0;
        int index = 0;


        System.out.println("Entern an Integer: ");
        int number = input.nextInt();


        while (number != 1) {
            for (int i = 2; i <= number; i++) {
                if (isPrime(i)) {
                    if (number % i == 0) {
                        primeFactors[index++] = i;
                        number /= i;
                    }
                }
            }

        }

        sort(primeFactors);

        System.out.print("Decreasing order:  ");
        for (int i = 0; i < primeFactors.length; i++) {
            if(primeFactors[i] != 0)
                System.out.print(primeFactors[i] + " ");
        }

        for (int i = 0; i < primeFactors.length; i++) {
            if(primeFactors[i] != 0) {
                stack1.push(primeFactors[i]);
                numberOfPushedInteger++;
            }
        }
        System.out.println();
        System.out.print("We used pop() method:  ");

        for (int i = 0; i < numberOfPushedInteger; i++) {
            System.out.print(stack1.pop() + "  ");
        }


    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                isPrime = false;
        }
        return isPrime;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}