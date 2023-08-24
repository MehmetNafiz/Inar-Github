package week_03.assigments;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58ºF and 41ºF:");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour");
        double wind = input.nextDouble();

        double windChill;
        windChill = 35.74+(0.6215*fahrenheit)-(35.75*Math.pow(wind,0.16))+(0.4275*fahrenheit*Math.pow(wind,0.16));

        if(wind<2 && (fahrenheit < -58 || fahrenheit > 41))
            System.out.println("Invalid wind and temparature input");
        else if (wind<2)
            System.out.println("Invalid wind input");
        else if (fahrenheit < -58 || fahrenheit > 41)
            System.out.println("Invalid fahrenheit input");
        else
            System.out.println("The wind chill index is "+(int)(windChill*10000)/10000.0);
    }
}
