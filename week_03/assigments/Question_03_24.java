package week_03.assigments;

public class Question_03_24 {
    public static void main(String[] args) {
        int rankNumber = (int)(Math.random()*13) + 1;
        int suitNumber = (int)(Math.random()*4) + 1;

        System.out.print("The card you picked is ");

        if (rankNumber == 1)
            System.out.print("Ace");
        else if (rankNumber == 11)
            System.out.print("Jack");
        else if (rankNumber == 12)
            System.out.print("Queen");
        else if (rankNumber == 13)
            System.out.print("King");
        else
            System.out.print(rankNumber);


        if (suitNumber == 1)
            System.out.print(" of Clubs");
        else if (suitNumber == 2)
            System.out.print(" of Diamonds");
        else if (suitNumber == 3)
            System.out.print(" of Hearts");
        else
            System.out.print(" of Spades");


    }
}
