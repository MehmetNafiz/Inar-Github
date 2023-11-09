package week_09.assignments.Question_09_01;

public class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle(){};

    public Rectangle(double widht, double height){
        this.width = widht;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }
}
