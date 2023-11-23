package week_11.assingments.Question_11_02;

public class Student extends Person{
    protected String status;
    private final String FRESHMAN = "Freshman";
    private final String SOPHOMORE = "Sophomore";
    private final String JUNIOR = "Junior";
    private final String SENIOR = "Senior";

    public Student(){}

    public Student(String status){
        this.status = status;
    }

    public Student(String name, String address, int phoneNumber, String eMail, String status){
        super(name, address, phoneNumber, eMail);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return "Class Name: Student\nPerson Name: " + getName();
    }


}
