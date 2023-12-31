package week_12.assingments.Question_12_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceText2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Arg count is not 3");
            System.exit(1);
        }

        File[] files = new File(args[0]).listFiles();

        if (files == null) {
            System.out.println("Directory: " + args[0] + " is not a valid file directory.");
            System.exit(2);
        }
        for (File f : files) {
            replaceStrNextFile(f, args[1], args[2]);
        }

    }

    static void replaceStrNextFile(File file, String oldString, String nuString) {
        ArrayList<String> strHelper = new ArrayList<>();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(oldString, nuString);
                strHelper.add(s2);

            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < strHelper.size(); i++) {
                output.println(strHelper.remove(i));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
