package week_08.assingments;

import java.util.Scanner;

public class Question_08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double coordinatesOfCities[][];
        double coordinatesOfCentralCity[][];

        System.out.println("Enter the number of the cities:");
        int numberOfCities = input.nextInt();

        coordinatesOfCities = fillCoordinates(numberOfCities);
        coordinatesOfCentralCity = computeCentralCity(coordinatesOfCities);

        displayResult(coordinatesOfCentralCity);
    }

    private static void displayResult(double[][] array) {
        System.out.printf("The central city is at(%.1f,%.1f)\n" +
                "The total distance to all other cities is %.2f",array[0][0], array[0][1], array[0][2]);
    }

    private static double[][] computeCentralCity(double[][] coordinatesOfCities) {
        double coordinatesOfCentralCity[][] = new double[1][3]; //third parameter for distance
        double distanceBetweenCities;
        double minDistanceBetweenCities = 100;

        for (int i = 0; i < coordinatesOfCities.length; i++) {
            distanceBetweenCities = 0;
            for (int j = 0; j < coordinatesOfCities.length; j++) {
                if (i == j)
                    continue;
                else {
                    distanceBetweenCities += Math.sqrt((Math.pow(coordinatesOfCities[i][0] - coordinatesOfCities[j][0], 2)) +
                            (Math.pow(coordinatesOfCities[i][1] - coordinatesOfCities[j][1], 2)));
                }
            }
            if (distanceBetweenCities < minDistanceBetweenCities) {
                minDistanceBetweenCities = distanceBetweenCities;
                coordinatesOfCentralCity[0][0] = coordinatesOfCities[i][0];
                coordinatesOfCentralCity[0][1] = coordinatesOfCities[i][1];
                coordinatesOfCentralCity[0][2] = minDistanceBetweenCities;
            }
        }
        return  coordinatesOfCentralCity;
    }

    private static double[][] fillCoordinates(int numberOfCities) {
        Scanner input = new Scanner(System.in);
        double[][] coordinatesOfCities = new double[numberOfCities][2];

        System.out.println("Enter the coordinates of " + numberOfCities + " cities:");
        for (int i = 0; i < coordinatesOfCities.length; i++) {
            coordinatesOfCities[i][0] = input.nextDouble();
            coordinatesOfCities[i][1] = input.nextDouble();
        }

        return coordinatesOfCities;
    }
}
