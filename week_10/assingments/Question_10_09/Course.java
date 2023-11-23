package week_10.assingments.Question_10_09;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if(numberOfStudents > student.length()){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
        System.out.println("Added student: " + student + " has been added to " + getCourseName());

    }
    public  String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }
    public void dropStudents(String student){
        for (int i = 0; i < numberOfStudents; i++) {
            if(students[i].equals(student)){
                students[i] = "";
                break;
            }
        }
        System.out.println("Dropped student: " + student + " has been dropped from " + getCourseName());
    }

    public void clear(){
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
    }

}
