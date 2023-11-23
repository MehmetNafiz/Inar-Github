package week_11.assingments.Question_11_02;

public class Faculty extends Employee{
    private int hours;
    private int rank;

    public Faculty(){}

    public Faculty(int hours, int rank){
        this.rank = rank;
        this.hours = hours;
    }

    public Faculty(String name, String address, int phoneNumber, String eMail,
                   String office, int sallary, int rank, int hours){
        super(name, address, phoneNumber, eMail, office, sallary);
        this.rank = rank;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString(){
        return "Class Name: Faculty\nPerson Name: " + getName();

    }
}
