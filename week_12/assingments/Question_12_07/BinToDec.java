package week_12.assingments.Question_12_07;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number as a string: ");
        String bStr = in.nextLine().trim();
        try {

            System.out.println("Binary number: " + bStr + " converted to decimal is " + bin2Dec(bStr));

        } catch (NumberFormatException numberFormatException) {
            System.out.println("It is not a binary string");
        }
    }

    public static int bin2Dec(String binaryString) {
        int decimalValue = 0;
        if (!checkBinaryChars(binaryString)) {
            throw new NumberFormatException("Binary String contains invalid characters.");
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
