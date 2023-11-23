package week_10.live_class;

public class CourseTest {
    public static void main(String[] args) {


        Course course1 = new Course("Mat101");
        course1.addStudent("Ayşe");
        course1.addStudent("Ahmet");
        System.out.println(course1.getNumberOfStudents());
    }
}
