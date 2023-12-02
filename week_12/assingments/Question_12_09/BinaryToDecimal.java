package week_12.assingments.Question_12_09;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.next();
        try {
            System.out.println("Enter a binary number: ");
            System.out.println("Binary number: " + number + " converted to decimal is " + bin2Dec(number));

        } catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException);
        }
    }

    public static int bin2Dec(String binaryString) {
        int decimalValue = 0;
        if (!checkBinaryChars(binaryString)) {
            throw new BinaryFormatException();
        }
        char[] binChars = binaryString.toCharArray();

        for (int i = binChars.length - 1, binaryIndex = 0; i >= 0; i--, binaryIndex++) {
            decimalValue += getBinaryValue(binChars[i], binaryIndex);
        }


        return decimalValue;
    }

    static boolean checkBinaryChars(String binaryString) {
        char[] binStrValues = binaryString.toCharArray();
        for (char c : binStrValues) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    static int getBinaryValue(char binaryChar, int index) {
        int weight = (int) Math.pow(2, index);
        if (binaryChar == '1') {
            return weight;
        }
        return 0;
    }
}
