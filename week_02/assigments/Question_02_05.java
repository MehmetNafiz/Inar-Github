package week_02.assigments;
import java.util.Scanner;
public class Question_02_05 {
    public static void main(String[] args) {            Scanner input = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate:");
            double subtotal = input.nextDouble();
            double gratuity = input.nextDouble();

            double total = subtotal + (subtotal * gratuity / 100);

            System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
        }
    }