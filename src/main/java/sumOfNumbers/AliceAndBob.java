package sumOfNumbers;
import java.util.Scanner;

public class AliceAndBob {

    public static void main(String[] args) {

        String userName;
        String name1 = "Alice";
        String name2 = "Bob";

        do{
            System.out.println("Enter your Name: ");
            Scanner name3 = new Scanner(System.in);
            userName = name3.next();

            userNames(userName);

        }while (!userName.equals(name1) && !userName.equals(name2));
    }

    public static void userNames(String name) {

            if (name.equalsIgnoreCase("Alice")){
                System.out.println("Welcome home: Alice");
            }
            else if (name.equalsIgnoreCase("Bob")) {
                System.out.println("Welcome home: Bob");
            }else {
                System.out.println("There are no users by the name: " + "'" + name + "'" + " on this device.");
            }
    }
}


