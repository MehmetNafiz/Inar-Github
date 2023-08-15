package week_02.assigments;

import java.util.Scanner;

public class Question_02_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF:");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour");
        double wind = input.nextDouble();

        double windChill;
        windChill = 35.74+(0.6215*fahrenheit)-(35.75*Math.pow(wind,0.16))+(0.4275*fahrenheit*Math.pow(wind,0.16));

        System.out.println("The wind chill index is "+(int)(windChill*10000)/10000.0);
    }



}
