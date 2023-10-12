package week_07.assignments;

import java.util.Scanner;

public class Question_07_35 {
    public static void main(String[] args) {
        String[] list = {"pronunciation", "asterisk", "manager", "science", "teacher",
                "kitchen", "machine", "pencil", "apple", "country"};
        String yesOrNo = "y";


        while (yesOrNo == "y") {
            String word = pickWord(list);

            int numberOfWrong = game(word);

            yesOrNo = decideYesOrNo(word, numberOfWrong);
        }
    }

    private static String decideYesOrNo(String word, int numberOfWrong) {
        Scanner input = new Scanner(System.in);

        System.out.println("**********************************");
        System.out.println("The word is " + word + ". You missed " + numberOfWrong + " times.");
        System.out.println("Do you want to guess another word? Enter y or n ->");
        return input.nextLine();
    }

    public static String pickWord(String[] list) {
        return list[(int) (Math.random() * 10)];
    }

    public static int game(String word) {
        Scanner input = new Scanner(System.in);
        int numberOfWrong = 0;
        String[] guessWord = new String[word.length()];

        for (int i = 0; i < word.length(); i++) {
            guessWord[i] = "*";
        }

        while (!guessWord.equals(word)) {
            System.out.print("(Guess) Enter a letter in word  ");
            for (String letter : guessWord) {
                System.out.print(letter);
            }
            String letter = input.nextLine();

            String result = checkAndChange(word, guessWord, letter);
            if (result.equals("wrong"))
                numberOfWrong++;
        }
        return numberOfWrong;
    }

    private static String checkAndChange(String word, String[] guessWord, String letter) {
        String result = "wrong";
        boolean isAlreadyIn = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0) && guessWord[i] == "*") {
                guessWord[i] = letter;
                result = "correct";
            } else if (word.charAt(i) == letter.charAt(0) && guessWord[i] == letter) {
                isAlreadyIn = true;
            }
        }
        if( isAlreadyIn) {
            System.out.println(letter + " is already in the list");
            return "alreadyIn";
        }
        else if (result == "correct") {
            return "correct";
        }
        else{
            System.out.println(letter + " is not int the word");
            return "wrong";
        }
    }
}
