package week_05.assigments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int space = number;

        for (int i = 1; i <= number ; i++) {
            String line = "";
            int digit = i;

            for (int j = space; j >  0; j--) {
                line += "   ";
            }
            space--;

            while(digit >= 1){
                if(digit <10)
                    line += digit + "  ";
                else
                    line += digit + " ";
                digit--;
            }
            digit +=2;
            while (digit <= i){
                line += digit + "  ";
                digit++;
            }
            System.out.println(line);
        }
    }
}
