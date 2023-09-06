package week_04.assigments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city:");
        String firstCity = input.nextLine();

        System.out.println("Enter the second city:");
        String secondCity = input.nextLine();

        System.out.println("Enter the third city:");
        String thirdCity = input.nextLine();
        String first = "1";
        String second = "2";
        String third = "3";

        if (firstCity.compareTo(secondCity) < 0 && first.compareTo(thirdCity) < 0)
            first = firstCity;
        else if (firstCity.compareTo(secondCity) > 0 && first.compareTo(thirdCity) > 0)
            third = firstCity;
        else
            second = firstCity;


        if (secondCity.compareTo(firstCity) < 0 && secondCity.compareTo(thirdCity) < 0)
            first = secondCity;
        else if (secondCity.compareTo(firstCity) > 0 && secondCity.compareTo(thirdCity) > 0)
            third = secondCity;
        else
            second = secondCity;


        if (thirdCity.compareTo(firstCity) < 0 && thirdCity.compareTo(secondCity) < 0)
            first = thirdCity;
        else if (thirdCity.compareTo(firstCity) > 0 && thirdCity.compareTo(secondCity) > 0)
            third = thirdCity;
        else
            second = thirdCity;

        System.out.println("The three cities in alphabetical order are " + first +
                " " + second + " " + third);


    }
}

