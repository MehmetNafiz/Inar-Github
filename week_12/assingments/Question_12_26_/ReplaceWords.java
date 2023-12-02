package week_12.assingments.Question_12_26_;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWords {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: java Exercise12_27 *");
            return;
        }
        if (!args[0].equals("*")) {
            System.out.println("Usage: java Exercise12_27 *");
            return;
        }

        File file = new File(".");
        if (file.list().length > 0) {
            ArrayList<File> files = new ArrayList<>(Arrays.asList(file.listFiles()));
            for (File f : files) {
                if (!f.getName().equalsIgnoreCase("Exercise12_27.java")) {
                    ArrayList<String> lines = new ArrayList<>();
                    try (Scanner fileIn = new Scanner(f)) {
                        while (fileIn.hasNextLine()) {
                            lines.add(fileIn.nextLine().trim());
                        }
                        lines = handleRename(lines);

                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                    try (PrintWriter printWriter = new PrintWriter(f)) {
                        for (String line : lines) {
                            printWriter.println(line);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

            }
        } else {
            System.out.println("The current directory is empty.");
        }

    }

    private static ArrayList<String> handleRename(ArrayList<String> lines) {
        ArrayList<String> nuList = new ArrayList<>();
        for (String line : lines) {
        }
        return nuList;
    }
}
