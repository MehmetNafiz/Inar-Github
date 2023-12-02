package week_12.assingments.Question_12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {
        ArrayList<String> newText = new ArrayList<>();

        if (args.length != 3) {
            System.out.println("Usage:java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        try {
            Scanner fileRead = new Scanner(file);

            while (fileRead.hasNextLine()) {
                String currentLine = fileRead.nextLine();
                String newLine = currentLine.replaceAll(args[1], args[2]);
                newText.add(newLine);
                fileRead.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }

        try {
            PrintWriter fileWrite = new PrintWriter(file);
            for (int i = 0; i < newText.size(); i++) {
                fileWrite.println(newText.get(i));
            }
            fileWrite.close();

        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }
}
