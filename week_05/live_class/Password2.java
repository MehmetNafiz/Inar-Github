package week_05.live_class;

import java.util.Date;
import java.util.Scanner;

public class Password2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date();

        final String PASSWORD = "admin1234";
        final int MAX_ATTEMPT = 3;
        String attemptString = "";
        boolean isAccessGranted = false;

        for (int i = 1; i <= MAX_ATTEMPT; i++) {
            System.out.println("Enter your password: ");
            String userPassword = input.nextLine();

            if (userPassword.equals(PASSWORD)) {
                System.out.println("Access granted");
                isAccessGranted = true;
                break;
            }
            else{
                System.out.println("Wrong password. Remaining attempt:" + (MAX_ATTEMPT-1));
                attemptString += i + "- " + date.toString() + "\n";

            }
        }
        if(!isAccessGranted){
            System.out.println("Access denied");
        }
        else{
            System.out.println("\n" + attemptString);
        }

    }

}
