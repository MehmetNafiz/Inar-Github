package week_10.assingments.Question_10_11;

public class Circle2D {
    private static double PI = 3.1415;
    private double x;
    private double y;

    private double radius;

    public Circle2D(){
        this(0,0,1);
    }

    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return PI * radius *radius;
    }

    public double getPerimeter(){
        return 2 * PI * radius;
    }

    public boolean contains(double x, double y){
        return this.x - radius < x && this.x + radius > x && this.y - radius < y && this.y + radius > y;
    }

    public boolean contains(Circle2D circle){
        return this.x - radius < circle.x && this.x + radius > circle.x && this.y - radius < circle.y && this.y + radius > circle.y;
    }

    public boolean coverlaps(Circle2D circle){
        return this.x - radius < circle.x || this.x + radius > circle.x || this.y - radius < circle.y || this.y + radius > circle.y;
    }


}
