package week_11.assingments.Question_11_05;

public class CourseTest {
    public static void main(String[] args) {
        Course mat1 = new Course("Mat1");

        mat1.addStudent("Nisanur");
        mat1.addStudent("Gürkan");
        mat1.addStudent("Sinan");
        mat1.addStudent("Mehmet");
        mat1.addStudent("Sefa");
        mat1.addStudent("Musa");
        mat1.addStudent("Berkan");

        System.out.println("After adding student to the course...");
        System.out.println(mat1);

        mat1.dropStudent("Sinan");
        mat1.dropStudent("Mehmet");
        mat1.dropStudent("Berkan");

        System.out.println("After dropping student from the course...");
        System.out.println(mat1);



    }
}
