package week_09.assignments.Question_09_10;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }

    public double getRoot1(){
        double  root1 =(-b + Math.sqrt(getDiscriminant())) / (2 * a);
        return (int)(root1 * 1000) / 1000.0;
    }

    public double getRoot2(){
        double root2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        return (int)(root2 * 1000) / 1000.0;
    }
}
