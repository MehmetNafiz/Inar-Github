package week_04.assigments;

public class Question_04_03 {
    public static void main(String[] args) {
        final double RADIUS = 6371.01;
        double atlantaY = -84.3879824;
        double atlantaX = 33.7489954;
        double orlandoY = -81.3792364999;
        double orlandoX = 28.5383355;
        double savannahY = -81.09983419999998;
        double savannahX = 32.0835407;
        double charlotteY = -80.84312669999997;
        double charlotteX = 35.2270869;

        double distanceAtlantaToOrlando = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaX)) * Math.sin(Math.toRadians(orlandoX)) +
                Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(atlantaY-orlandoY)));
        double distanceOrlandoToSavannah = RADIUS * Math.acos(Math.sin(Math.toRadians(orlandoX)) * Math.sin(Math.toRadians(savannahX)) +
                Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(orlandoY-savannahY)));
        double distanceSavannahToCharlotte = RADIUS * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(charlotteX)) +
                Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(savannahY-charlotteY)));
        double distanceCharlotteToAtlanta = RADIUS * Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(atlantaX)) +
                Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(charlotteY-atlantaY)));

        double distanceSavannahToAtlanta = RADIUS * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(atlantaX)) +
                Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(savannahY-atlantaY)));

        double sOfLeftTriangle = (distanceOrlandoToSavannah + distanceSavannahToAtlanta + distanceAtlantaToOrlando)/2;
        double areaOfLeftTriangle = Math.sqrt(sOfLeftTriangle * (sOfLeftTriangle - distanceOrlandoToSavannah) * (sOfLeftTriangle - distanceSavannahToAtlanta)
                * (sOfLeftTriangle - distanceAtlantaToOrlando));

        double sOfRightTriangle = (distanceSavannahToCharlotte + distanceCharlotteToAtlanta + distanceSavannahToAtlanta)/2;
        double areaOfRightTriangle = Math.sqrt(sOfRightTriangle * (sOfRightTriangle - distanceSavannahToCharlotte) * (sOfRightTriangle - distanceCharlotteToAtlanta)
                * (sOfRightTriangle - distanceSavannahToAtlanta));

        double totalArea = areaOfLeftTriangle + areaOfRightTriangle;

        System.out.println("Estimated area enclosed by these four cities: "+ totalArea);





    }
}
