package oop;

public class Person {
    //Properties / attributes / instance variables
    public int head;
    public String name;

    //paramarterized Constructor
    public Person(int head,String name){
        this.head = head;
        this.name = name;
    }

    //Methods
    public String walk(){
        return"Walking..";
    }


}
