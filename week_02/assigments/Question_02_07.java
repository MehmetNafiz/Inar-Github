package week_02.assigments;
import java.util.Scanner;
public class Question_02_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        int minute = input.nextInt();

        int year= minute/(365*24*60);
        int day = (minute%(365*24*60))/(24*60);

        System.out.println(minute+" minutes is approximately "+year+" and "+day+ "days");
    }
}
