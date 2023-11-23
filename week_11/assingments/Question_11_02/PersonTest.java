package week_11.assingments.Question_11_02;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Gürol", "İstanbul", 444_55_66, "gurol@gmail.com");
        System.out.println("   _Person_");
        System.out.println("Name: " + person1.getName());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("Phone Number: " + person1.getPhoneNumber());
        System.out.println("Email Address: " + person1.geteMail());

        System.out.println();

        Student student1 = new Student("Nafiz", "Ankara", 555_66_77, "nafiz@gmail.com", "0");
        System.out.println("   _Student_");
        System.out.println("Name: " + student1.getName());
        System.out.println("Address: " + student1.getAddress());
        System.out.println("Phone Number: " + student1.getPhoneNumber());
        System.out.println("Email Address: " + student1.geteMail());
        System.out.println("Class Status: " + student1.getStatus() );

        System.out.println();

        Employee employee1 = new Employee("Recai", "İstanbul", 777_88_99, "recai@gmail.com", "910", 60000);
        System.out.println("   _Employee_");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Address: " + employee1.getAddress());
        System.out.println("Phone Number: " + employee1.getPhoneNumber());
        System.out.println("Email Address: " + employee1.geteMail());
        System.out.println("Office: " + employee1.getOffice());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("Hired Date: " + employee1.getHiredDate());

        System.out.println();

        Faculty faculty1 = new Faculty("Serhat", "Dallas", 111_22_33, "serhat@gmail.com", "101", 50000,99,5);
        System.out.println("   _Faculty_");
        System.out.println("Name: " + faculty1.getName());
        System.out.println("Address: " + faculty1.getAddress());
        System.out.println("Phone Number: " + faculty1.getPhoneNumber());
        System.out.println("Email Address: " + faculty1.geteMail());
        System.out.println("Office: " + faculty1.getOffice());
        System.out.println("Salary: " + faculty1.getSalary());
        System.out.println("Hired Date: " + faculty1.getHiredDate());
        System.out.println("Office Hours: " + faculty1.getHours());
        System.out.println("Rank: " + faculty1.getRank());

        System.out.println();

        Staff staff1 = new Staff("Elon", "California", 222_33_44, "elon@gmail.com", "12", 6005000,"CEO");
        System.out.println("   _Staff_");
        System.out.println("Name: " + staff1.getName());
        System.out.println("Address: " + staff1.getAddress());
        System.out.println("Phone Number: " + staff1.getPhoneNumber());
        System.out.println("Email Address: " + staff1.geteMail());
        System.out.println("Office: " + staff1.getOffice());
        System.out.println("Salary: " + staff1.getSalary());
        System.out.println("Hired Date: " + staff1.getHiredDate());
    }
}
