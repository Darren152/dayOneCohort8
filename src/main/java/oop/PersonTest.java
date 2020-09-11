package oop;

public class PersonTest {
    public static void main(String[] args) {

        Person person1 = new Person(2, "Corey");
        //Object.Method
        //person1.name = "Peter";
        System.out.println(person1.name);
        System.out.println(person1.walk());

    }

}
