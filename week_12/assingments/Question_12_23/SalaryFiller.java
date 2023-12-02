package week_12.assingments.Question_12_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SalaryFiller {
    public static void main(String[] args) {
        String[] names = {"Albert", "Boris", "Craig", "Darian", "Drake", "Sage", "Jadira", "Xia", "Elena", "Kaitlyn"};
        String[] surnames = {"Black", "Glory", "Diamond", "Haven", "Lively", "North", "Nice", "Honest", "Thought", "Dean"};
        String[] ranks = {"Assistant", "Associate", "Full"};

        ArrayList<String> list = new ArrayList<>();

        fillList(list, names, surnames, ranks);

        File file = new File("C:\\Users\\mehme\\WorkSpace\\inar-java\\src\\week_12\\assingments\\Question_12_23\\Salary.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            PrintWriter fileWriter = new PrintWriter(file);

            for (int i = 0; i < list.size(); i++) {
                fileWriter.println(list.get(i));
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fillList(ArrayList<String> list, String[] names, String[] surnames, String[] ranks) {
        String currentName;
        String currentSurname;
        String currentRank;
        int currentSallary;

        for (int i = 0; i < 1000; i++) {
            currentName = names[(int) (Math.random() * 10)];
            currentSurname = surnames[(int) (Math.random() * 10)];
            currentRank = ranks[(int) (Math.random() * 3)];

            if(currentRank.equals("Assistant"))
                currentSallary = (int)(Math.random() * 30_000) + 50_000;
            else if (currentRank.equals("Associate")) {
                currentSallary = (int)(Math.random() * 50_000) + 60_000;
            }
            else
                currentSallary = (int)(Math.random() * 55_000) + 75_000;

            String currentLine = currentName + " " + currentSurname + " " + currentRank + " " + currentSallary;
            list.add(currentLine);
        }

    }
}
