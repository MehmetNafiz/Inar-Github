package week_04.assigments;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex digit:");
        String hexString = input.nextLine();
        int binary = 0;
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        switch(hexString){
		case "0": break;
		case "1": binary = 1; break;
		case "2": binary = 10; break;
		case "3": binary = 11; break;
		case "4": binary = 100; break;
		case "5": binary = 101; break;
		case "6": binary = 110; break;
		case "7": binary = 111; break;
		case "8": binary = 1000; break;
		case "9": binary = 1001; break;
		case "A": binary = 1010; break;
		case "B": binary = 1011; break;
		case "C": binary = 1100; break;
		case "D": binary = 1101; break;
		case "E": binary = 1110; break;
		case "F": binary = 1111; break;
            default: binary = 2;
            }
        System.out.println((binary == 2) ? "Invalid Input" : "The binary value is " + binary);


    }
}
