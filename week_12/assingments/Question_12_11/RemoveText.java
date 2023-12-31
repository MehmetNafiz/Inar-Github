package week_12.assingments.Question_12_11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
    public static void main(String[] args) throws Exception {

        String toRemove = args[0];

        File sourceFile = new File(args[1]);

        if (!sourceFile.exists()) {
            System.out.println("The file " + sourceFile.getName() + "does not exist.");
            System.exit(1);
        }

        Scanner in = new Scanner(sourceFile);


        String str1 = "";
        String str2 = "";

        while (in.hasNext()) {

            str1 += in.nextLine();
            str2 = str1.replaceAll(toRemove, "");

        }

        File targetFile = new File(toRemove + "_Revised.txt");

        try (
                PrintWriter out = new PrintWriter(targetFile);
        ) {
            out.print(str2);
        }

        in.close();

        System.out.println("Your edited file is complete.");
    }
}
