package week_07.assignments;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100]; // true = open; false = closed;
        for (int student = 1; student <= 100; student++) {
            for (int i = student - 1; i < lockers.length; i += student) {
                lockers[i] = !lockers[i];
            }
        }
        printLockers(lockers);
    }

    private static void printLockers(boolean[] lockers) {
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i])
                System.out.println("Locker " + (i + 1) + " is open ");
        }
    }
}
