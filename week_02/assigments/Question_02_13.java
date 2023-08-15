package week_02.assigments;
import java.util.Scanner;
public class Question_02_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount:");
        double amount = input.nextDouble();

        double afterFirst = amount * (1+0.05/12);
        double afterSecond = (amount+afterFirst)*(1+0.05/12);
        double afterThird = (amount+afterSecond)*(1+0.05/12);
        double afterFourth = (amount+afterThird)*(1+0.05/12);
        double afterFifth = (amount+afterFourth)*(1+0.05/12);
        double afterSixth = (amount+afterFifth)*(1+0.05/12);

        System.out.println("After the sixth month, the account value is $"+
                (int)(afterSixth*100)/100.0);

    }
}
