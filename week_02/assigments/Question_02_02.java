package week_02.assigments;
import java.util.Scanner;
public class Question_02_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius and length of a cylinder:");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius*radius*3.141592653589793;
        double volume = area*length;

        System.out.println("The area is "+(int)(area*100)/100.0);
        System.out.println("The volume is "+(int)(volume*10)/10.0);


    }
}
