package week_10.assingments.Question_10_09;

public class CourseTest {
    public static void main(String[] args) {
        Course InarJava = new Course("Inar Java");

        InarJava.addStudent("Özgür Kartal");
        InarJava.addStudent("Bilal Topal");
        InarJava.addStudent("Ada Kaya");
        InarJava.addStudent("Besim Karabıyık");
        InarJava.addStudent("Emir Uyanık");

        InarJava.dropStudents("Özgür Kartal");
        InarJava.dropStudents("Ada Kaya");
        InarJava.dropStudents("Besim Karabıyık");
    }
}
