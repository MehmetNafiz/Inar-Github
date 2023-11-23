package week_11.assingments.Question_11_10;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListStack {
    private ArrayList<Object> myList = new ArrayList<>();

    public boolean isEmpty(){
        return myList.isEmpty();
    }

    public int getSize(){
        return myList.size();
    }

    public Object peek(){
        if(!myList.isEmpty()){
            return myList.get(myList.size() - 1);
        }
        return 0;
    }

    public Object pop(){
        if(!myList.isEmpty()){
            Object obj = myList.get(getSize() - 1);
            myList.remove(getSize() - 1);
            return obj;
        }
        return 0;
    }

    public void push(Object obj){
        myList.add(obj);
    }

    public String toString(){
        return "Stack: " + myList.toString();
    }
}
