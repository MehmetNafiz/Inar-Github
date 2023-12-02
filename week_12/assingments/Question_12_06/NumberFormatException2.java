package week_12.assingments.Question_12_06;

import java.util.Scanner;

public class NumberFormatException2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        }
        catch (NumberFormatException ex){
            System.out.println("It is not a hex string.!");
        }
    }

    public static int hexToDecimal(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            char currentChar = hex.charAt(i);
            if((currentChar >= 65 && currentChar <= 70) || (currentChar >= 48 && currentChar <= 57))
                continue;
            else
                throw new NumberFormatException();
        }

        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else // ch is '0', '1', ..., or '9'
            return ch - '0';
    }
}

