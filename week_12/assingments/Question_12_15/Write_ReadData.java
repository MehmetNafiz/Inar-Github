package week_12.assingments.Question_12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Write_ReadData {
    public static void main(String[] args) throws FileNotFoundException {
         ArrayList<Integer> line = new ArrayList<>();

        File file = new File("C:\\Users\\mehme\\WorkSpace\\inar-java\\src\\week_12\\assingments\\Question_12_15\\Data.txt");

        if (!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("File can't created");            }
        }

        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < 100; i++) {
            int randomNumber = (int)(Math.random() * 1000);
            printWriter.print(randomNumber);
            printWriter.print(" ");
        }
        printWriter.close();

        Scanner fileInput = new Scanner(file);

        while(fileInput.hasNextLine()){
            String[] integers = fileInput.nextLine().split(" ");
            for (String number: integers) {
                line.add(Integer.parseInt(number));
            }
        }
        fileInput.close();

        System.out.println("Original List: " + line);
        Collections.sort(line);
        System.out.println("Sorted List: " + line);
    }
}
