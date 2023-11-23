package week_11.assingments.Question_11_02;

public class Staff extends Employee {
    private String title;

    Staff() {
    }

    Staff(String title) {
        this.title = title;
    }

    Staff(String name, String address, int phoneNumber, String eMail, String office, int sallary, String title) {
        super(name, address, phoneNumber, eMail, office, sallary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "ClassName: Staff\nPersonName: " + getName();
    }
}
