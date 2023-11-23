package week_11.assingments.Question_11_06;

import week_10.assingments.Question_10_11.Circle2D;
import week_10.live_class.Loan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class ArrayListObject {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(new Loan(2.5,1,1000));
        list1.add(new Date());
        list1.add("Inar Academy");
        list1.add(new Circle2D(0,0,1));

        displayList(list1);
    }

    private static void displayList(ArrayList<Object> list1) {

        for (int i = 0; i < list1.size(); i++) {
            Object currentObject = list1.get(i);

            if(currentObject instanceof Loan){
                System.out.println("Annual Interest Rate: " + ((Loan)currentObject).getAnnualInterestRate());
                System.out.println("Number Of Years: " + ((Loan)currentObject).getNumberOfYear());
                System.out.println("Loan Amount : " + ((Loan)currentObject).getLoanAmount());
                System.out.println("Loan Date : " + ((Loan)currentObject).getLoanDate());
            } else if (currentObject instanceof Date) {
                System.out.println(((Date)currentObject).getTime());
            } else if (currentObject instanceof Circle2D) {
                System.out.println("Radius : " + ((Circle2D)currentObject).getRadius());
            }
            else
                System.out.println(currentObject);

            System.out.println("-------------------------------");

        }
    }
}
