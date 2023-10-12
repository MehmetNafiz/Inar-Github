package week_07.assignments;

public class Question_07_29 {
    public static void main(String[] args) {
        int[] selectedCards = pickCard();

        computeSumAndDisplay(selectedCards);
    }


    private static int[] pickCard() {
        int[] selectedCards = new int[4];
        while(selectedCards[0] + selectedCards[1] + selectedCards[2] + selectedCards[3] != 24 )
        for (int i = 0; i < selectedCards.length; i++) {
            selectedCards[i] = (int) (Math.random() * 12) + 1;
        }
        return selectedCards;
    }

    private static void computeSumAndDisplay(int[] selectedCards) {
        int sum = 0;

        for (int i = 0; i < selectedCards.length; i++) {
            sum += selectedCards[i];
        }
        System.out.print("The number of picks that yields the sum of " + sum + ": ");

        for (int i = 0; i < selectedCards.length; i++) {
            int currentNumber = selectedCards[i];
            if (currentNumber == 13)
                System.out.print("King ");
            else if (currentNumber == 12)
                System.out.print("Queen ");
            else if (currentNumber == 11)
                System.out.print("Jack ");
            else if (currentNumber == 1)
                System.out.print("Ace ");
            else
                System.out.print(currentNumber + " ");
        }
    }
}

