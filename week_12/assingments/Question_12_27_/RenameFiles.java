package week_12.assingments.Question_12_27_;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;

public class RenameFiles {
    private static final Pattern PATTERN = Pattern.compile("Question_\\d_\\d.*");

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: java Exercise12_28 *");
            return;
        }
        if (!args[0].equals("*")) {
            System.out.println("Usage: java Exercise12_28 *");
            return;
        }

        File srcDirectory = new File("./Texts");
        if (!srcDirectory.isDirectory()) {
            System.out.println("The directory path is not a directory: " + srcDirectory.getAbsolutePath());
            return;
        }

        if (!Objects.isNull(srcDirectory.listFiles()) && srcDirectory.listFiles().length > 0) {
            ArrayList<File> files = new ArrayList<>(Arrays.asList(srcDirectory.listFiles()));
            for (File f : files) {
                String fileName = f.getName();
                StringBuffer stringBuffer = new StringBuffer(fileName);
                if (PATTERN.matcher(stringBuffer.toString()).matches()) {
                    stringBuffer.insert(fileName.lastIndexOf("e") + 1, "0");
                    System.out.println("Renaming: " + fileName + " to " + stringBuffer.toString());
                    Path srcPath = f.toPath();
                    Path trgtPath = Paths.get(srcDirectory.toPath().toString(), stringBuffer.toString());
                    try {
                        Files.move(srcPath, trgtPath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Rename successful");
                    } catch (IOException ioe) {
                        System.out.println("Something went wrong while renaming the file... " + fileName + "\n\n");
                        ioe.printStackTrace();
                    }

                }

            }
        } else {
            System.out.println("The current directory is empty...");
        }

    }
}
