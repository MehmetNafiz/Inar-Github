package week_09.assignments.Question_09_08;

public class FanTest {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setOn(true);
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");

        fan2.setSpeed(fan2.getMEDIUM());

        System.out.println(fan1);
        System.out.println(fan2);
    }
}
