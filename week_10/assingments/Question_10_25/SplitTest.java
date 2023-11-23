package week_10.assingments.Question_10_25;

import static week_10.assingments.Question_10_25.Split.split;

public class SplitTest {
    public static void main(String[] args) {
        Split obj1 = new Split();


        String str1 = "Java inar aca demy";

        String[] tokens = Split.split(str1," ");

        for (int i = 0; i < tokens.length; i++) {
            System.out.print(tokens[i] + "   ");
        }
    }
}
