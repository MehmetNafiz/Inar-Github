package week_02.assigments;
import java.util.Scanner;

public class Question_02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000");

        int number = input.nextInt();

        int firstDigit = number%10;
        number = number/10;

        int secondDigit = number%10;
        number = number/10;

        int thirdDigit = number;
        int total = firstDigit+secondDigit+thirdDigit;

        System.out.println("The sum of the digits is "+total);
    }
}
