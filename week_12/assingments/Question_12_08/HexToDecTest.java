package week_12.assingments.Question_12_08;

import java.util.Scanner;

public class HexToDecTest {
    public static void main(String[] args) throws HexFormatException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a hex number as String: ");
        String number = input.next();

        try{
            System.out.println("Hex String convert to decimal: " + hexToDecimal(number));
        }
        catch(HexFormatException ex){
            System.out.println("Invalid hex number");
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            if (checkHexChar(hexChar)) {
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            } else {
                throw new HexFormatException(hex);
            }

        }
        return decimalValue;
    }

    static boolean checkHexChar(char ch) {
        return ch >= '0' && ch <= 'F';
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else { // ch is '0', '1', ..., or '9'
            return ch - '0';
        }
    }
}
