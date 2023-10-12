package week_07.assignments;

import java.util.Scanner;

public class Question_07_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] charList;
        char[] sortedCharList;

        System.out.println("Enter a string to sort:");
        String word = input.nextLine();

        charList = stringToCharList(word);

         sortedCharList = sort(charList);

        displayList(sortedCharList);
    }

    private static char[] sort(char[] charList) {
        for (int i = charList.length - 1; i > 0 ; i--) {
            for (int j = i - 1; j >= 0 ; j--) {
                if (charList[i] < charList[j]) {
                    char tempt = charList[i];
                    charList[i] = charList[j];
                    charList[j] = tempt;
                }
            }
        }
        return charList;
    }

    private static char[] stringToCharList(String word) {
        char[] charList = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            charList[i] = word.charAt(i);
        }
        return charList;
    }

    public static void displayList(char[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
