package week_04.live_class;

public class AreaCircle {
    public static void main(String[] args) {
        double perimeter = 4;

        double area = Math.PI * Math.pow(perimeter,2);

        System.out.println(area);
        System.out.println("ceil: "+Math.ceil(area));
        System.out.println("floor: "+Math.floor(area));
        System.out.println("round: "+Math.round(area));


    }
}
