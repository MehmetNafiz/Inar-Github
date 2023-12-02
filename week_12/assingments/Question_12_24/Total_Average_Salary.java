package week_12.assingments.Question_12_24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Total_Average_Salary {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\mehme\\WorkSpace\\inar-java\\src\\week_12\\assingments\\Question_12_24\\Salary2.txt");

        double totalAssistantSallary = 0;
        double totalAssociateSallary = 0;
        double totalFullSallary = 0;
        double totalSallary = 0;

        double averageAssistantSallary = 0;
        double averageAssociateSallary = 0;
        double averageFullSallary = 0;
        double averageSallary = 0;

        try{
            Scanner fileInput = new Scanner(file);
            while (fileInput.hasNextLine()){
                String currentLine = fileInput.nextLine();
                String[] currentPerson = currentLine.split(" ");

            }
        }
        catch (FileNotFoundException ex){
            }

    }

}
