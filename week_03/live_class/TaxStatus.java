package week_03.live_class;
import java.util.Scanner;
public class TaxStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("(0-single filer, 1-married jointly or \" +\n" +
                "10 \"qualifying widow(er), 2-married separately, 3-head of \" +\n" +
                "11 \"household) Enter the filing status:");
        int status = input.nextInt();

        System.out.println("Enter the taxable income");
        double income = input.nextDouble();

        double tax = 0;

        switch (status){
            case 0:
                System.out.println("Compute tax for status 0");
                break;
            case 1:
                System.out.println("Compute tax for status 1");
                break;
            case 2:
                System.out.println("Compute tax for status 2");
                break;
            default:
                System.out.println("invalid status");
        }
    }
}