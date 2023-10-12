package week_07.assignments;

import java.util.Scanner;

public class Question_07_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] listOfExcludedNumber = new int[10];

        System.out.println("Enter ten numbers to exclude from random(1-54)");
        for (int i = 0; i < listOfExcludedNumber.length; i++) {
            listOfExcludedNumber[i] = input.nextInt();
        }

        int randomNumber = getRandom(listOfExcludedNumber);
        System.out.println("Number generated:  " + randomNumber);
    }

    private static int getRandom(int[] listOfExcludedNumber) {


        while (true){
            boolean isSuitable = true;
            int generatedNumber = (int)(Math.random() * 54);
            for (int i = 0; i < listOfExcludedNumber.length; i++) {
                if(generatedNumber == listOfExcludedNumber[i])
                    isSuitable = false;
            }
            if(isSuitable){
                return generatedNumber;
            }
        }
    }
}
