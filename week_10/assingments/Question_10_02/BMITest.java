package week_10.assingments.Question_10_02;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BMI person;
        String name;
        int age;
        double weight;
        double height;


        while (true) {
            System.out.println("Enter name:");
            name = input.next();

            System.out.println("Enter age:");
            age = input.nextInt();

            System.out.println("Enter weight:");
            weight = input.nextDouble();

            System.out.println("Enter height:");
            height = input.nextDouble();
            person = new BMI(name, age, weight, height);

            System.out.println("------------------");
            System.out.println("Name: " + person.getName());
            System.out.println("BMI : " + person.getStatus());
            System.out.println("********************");

        }
    }
}
