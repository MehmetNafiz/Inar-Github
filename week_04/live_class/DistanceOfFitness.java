package week_04.live_class;

import java.util.Scanner;

public class DistanceOfFitness {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the position of tree gym (24 hours, planet, Super :");

        int positionOfGym24Hour = input.nextInt();
        int positionOfGymPlanet = input.nextInt();
        int positionOfGymSuper = input.nextInt();

        int distanceOfGym24Hour = Math.abs(positionOfGym24Hour);
        int distanceOfGymPlanet = Math.abs(positionOfGymPlanet);
        int distanceOfGymSuper = Math.abs(positionOfGymSuper);

        int tempMin = Math.min(distanceOfGym24Hour,distanceOfGymPlanet);
        int min = Math.min(distanceOfGymSuper,tempMin);

        if(distanceOfGym24Hour == min)
            System.out.println("Nearest gym is Gym 24 Hour at " + positionOfGym24Hour);
        else if (distanceOfGymPlanet == min)
            System.out.println("Nearest gym is Gym Planet at " + positionOfGymPlanet);
        else
            System.out.println("Nearest gym is Gym Super at " + positionOfGymPlanet);

        int MembershipCostOfGym24Hour = 3;
        int MembershipCostOfGymPlanet = 10;
        int MembershipCostOfGymSuper = 5;

        final double PRICE_PER_KM = 0.5;

        double totalCostOfGym24Hour = (distanceOfGym24Hour * 2 * 0.5) + MembershipCostOfGym24Hour;
        double totalCostOfGymSuper = (distanceOfGymSuper * 2 * 0.5) + MembershipCostOfGymSuper;
        double totalCostOfGymPlanet = (distanceOfGymPlanet * 2 * 0.5) + MembershipCostOfGymPlanet;


        double temptCheapest = Math.min(totalCostOfGym24Hour,totalCostOfGymSuper);
        double cheapest = Math.min(temptCheapest,totalCostOfGymPlanet);

        if (cheapest == totalCostOfGym24Hour)
            System.out.println("Cheapest gym is Gym 24 Hour for $" + totalCostOfGym24Hour);
        else if (cheapest == totalCostOfGymPlanet)
            System.out.println("Cheapest gym is Gym Planet for $" + totalCostOfGymPlanet);
        else
            System.out.println("Cheapest gym is Gym Super for $" + totalCostOfGymSuper);

    }
}
