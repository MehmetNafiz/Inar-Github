package week_02.assigments;
import java.util.Scanner;
public class Question_02_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter inverstment amount:");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate in percentage:");
        double annualInterest = input.nextDouble();
        System.out.println("Enter number of year:");
        double year = input.nextDouble();

        double accumulatedValue = (investmentAmount * Math.pow((1 + (annualInterest/1200)),(year * 12)));

        System.out.println("Accumulated value is $"+(int)(accumulatedValue*100)/100.0);
    }
}
