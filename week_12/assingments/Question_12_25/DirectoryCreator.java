package week_12.assingments.Question_12_25;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DirectoryCreator {
    static String writePath = "C:\\Users\\mehme\\WorkSpace\\inar-java\\src\\week_12\\assingments\\Question_12_25";


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the directory name to create: ");
        String name = in.nextLine();
        if (createDirectory(writePath.concat(name))) {
            System.out.println("Directory created successfully");
        }

    }

    static boolean createDirectory(String pathToWrite) {
        Path dirPath;
        File file = new File(pathToWrite);
        if (!file.exists() && !file.isDirectory()) {
            Path dir = Paths.get(file.toURI());
            System.out.println("Preparing to create directory " + pathToWrite + " at " + file.getAbsolutePath());
            return file.mkdir();
        } else {
            System.out.println("A directory named " + pathToWrite + "already exists");
            return false;
        }
    }
}
