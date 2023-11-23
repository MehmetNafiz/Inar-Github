package week_11.assingments.Question_11_02;

public class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String eMail;

    Person(){}

    Person(String name, String address, int phoneNumber, String eMail){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String toString(){
        return "Class Name: Person\nPerson Name: " + name;
    }


}
