package week_12.assingments.Question_12_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file to read: ");
        String filePath = "C:\\Users\\mehme\\WorkSpace\\inar-java\\src\\week_12\\assingments\\Question_12_14\\Scores.txt";
        File file = new File(filePath);

        try (Scanner fileScanner = new Scanner(file)) {
            ArrayList<Double> scores = new ArrayList<>();
            while (fileScanner.hasNext()) {
                String value = fileScanner.next();
                scores.add(Double.parseDouble(value));
            }
            double total = 0;
            for (Double score : scores) {
                total += score;
            }
            double average = total / scores.size();
            System.out.printf("\nTotal is %.2f", total);
            System.out.printf("\nAverage is %.2f", average);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            System.out.println("Could not find this file: " + file.getAbsolutePath());
        }

        input.close();
    }
}
