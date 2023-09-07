package week_05.live_class;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        final String PASSWORD = "pass1234!";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Password");
        String pw = input.nextLine();

        while (!pw.equals(PASSWORD)){
            System.out.println("Wrong password. Try again.");
            pw = input.nextLine();
        }
        System.out.println("Access granted!");
    }
}
