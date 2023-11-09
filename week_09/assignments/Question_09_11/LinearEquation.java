package week_09.assignments.Question_09_11;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        if (a * d - b * c == 0)
            return false;
        else
            return true;
    }

    public double getX() {
        double x = (e * d - b * f) / (a * d - b * c);
        return x;
    }

    public double getY() {
        double y = (a * f - e * c) / (a * d - b * c);
        return y;
    }
}
