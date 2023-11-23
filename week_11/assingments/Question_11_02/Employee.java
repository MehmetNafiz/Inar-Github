package week_11.assingments.Question_11_02;

import java.util.Date;

public class Employee extends Person{
    private String office;
    private int salary;
    private java.util.Date hiredDate;

    public Employee(){}

    public Employee(String office, int sallary){
        this.office = office;
        this.salary = sallary;
        this.hiredDate = new java.util.Date();
    }

    public Employee(String name, String address, int phoneNumber, String eMail,String office, int sallary){
        super(name, address, phoneNumber, eMail);
        this.office = office;
        this.salary = sallary;
        this.hiredDate = new java.util.Date();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String toString(){
        return "Class Name: Employee\nPerson Name: " + getName();

    }
}
