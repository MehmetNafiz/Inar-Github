package week_12.assingments.Question_12_21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) throws IOException {
        boolean isSorted = true;
        String path = "C:\\Users\\mehme\\WorkSpace\\inar-java\\src\\week_12\\assingments\\Question_12_21\\Strings.txt";
        String wholeText = new String();

        File currentFile = new File(path);

        if(!currentFile.exists()){
            currentFile.createNewFile();
        }

        try {
            Scanner input = new Scanner(currentFile);
            while(input.hasNextLine()){
                String currentLine = input.nextLine();
                wholeText += currentLine;
                wholeText += " ";
            }
            input.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File Not Found");
            System.exit(1);
        }

        String[] words = wholeText.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            if(words[i].compareTo(words[i + 1]) > 1){
                isSorted = false;
                System.out.println("First 2 strings that are not sorted: " +
                        words[i] + "," + words[i + 1]);
                break;
            }
        }

        if (isSorted){
            System.out.println("Strings are sorted");
        }

    }
}
