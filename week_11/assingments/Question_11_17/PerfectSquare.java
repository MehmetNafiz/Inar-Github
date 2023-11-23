package week_11.assingments.Question_11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int n = findN(findSmallestFactors(number));
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + number * n);

    }

    static ArrayList<Integer> findSmallestFactors(int number) {

        ArrayList<Integer> smallFactors = new ArrayList<>();

        for (int f = 2; number != 1; f++) {
            if (number % f == 0) {
                smallFactors.add(f);
                number /= f;
                f = 1; // Reset the test factor
            }
        }
        return smallFactors;
    }

    static Integer findN(ArrayList<Integer> factors) {
        ArrayList<Integer> oddCounts = new ArrayList<>();
        for (int i = 0; i < factors.size(); i++) {
            int num = factors.get(i);
            int count = 0;
            for (Integer integer : factors) {
                if (integer == num) {
                    count++;
                }
            }
            if (count % 2 != 0 && !oddCounts.contains(num)) {
                oddCounts.add(num);
            }

        }

        Integer result = 1;
        for (Integer oddCount : oddCounts) {
            result *= oddCount;
        }
        return result;
    }
}
