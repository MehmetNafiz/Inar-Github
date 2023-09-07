package week_05.assigments;

import java.util.Scanner;

public class Question_05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        int divisor = 2;

        while(number != 1){
            while(number % divisor == 0){
                System.out.print(divisor + ", ");
                number /= divisor;
            }
            divisor++;
        }
    }
}
