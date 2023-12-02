package week_12.assingments.Question_12_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;
import java.net.URL;

public class WikiWordCounter {
    public static void main(String[] args) {
        String currentURL = "https://en.wikipedia.org/wiki/The_Cranberries";
        int count = 0;

        try{
            URL url = new URL(currentURL);
            Scanner input = new Scanner(url.openStream());

            while(input.hasNext()){
                String line = input.nextLine();
                String[] words = line.split(" ");
                count += words.length;
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Words number in path " + currentURL + " is " + count);
    }
}
