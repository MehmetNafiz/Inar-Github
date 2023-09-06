package week_04.live_class;

import java.util.Scanner;

public class ComputingAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double atlantaX = 33.748;
        double atlantaY = -84.387;
        double charlotteX = 35.227;
        double charlotteY = -80.84;
        double savannaX = 32.083;
        double savannaY = -81.099;

        double distanceAtlantaToCharlotte = Math.sqrt(Math.pow(atlantaX-charlotteX,2)+Math.pow(atlantaY-charlotteY,2));
        double distanceCharlotteToSavanna = Math.sqrt(Math.pow(charlotteX-savannaX,2)+Math.pow(charlotteY-savannaY,2));
        double distanceSavannaToAtlanta = Math.sqrt(Math.pow(savannaX-atlantaX,2)+Math.pow(savannaY-atlantaY,2));




    }
}
