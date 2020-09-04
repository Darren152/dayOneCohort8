package finalday;

import java.util.Scanner;

public class LastDay {
    //Create all Static Methods above Main
    public static void greetUser(){
        //Do This
        System.out.println("Hi");
        Scanner name = new Scanner(System.in);
        System.out.println("Enter you Name: ");
        String userName = name.nextLine();
    }
                  //Data Type is String
    public static String greetUserTwice(){
        //Do This
        return "Hello";
    }

    public static String greetThirdUser(String userName){
        //Do This
        return "Hello" + userName;
    }

    public static double calculateDiscount(double bigDiscount){
        //Convert Discount to Percent

        return bigDiscount * 100.00;
    }

    public static void main(String[] args) {
        //Use static methods here.

        greetUser();
        System.out.println(greetUserTwice());
        System.out.println(greetThirdUser("Ray"));

        //System.out.println("\n");
        System.out.println(calculateDiscount(.10));




        System.out.println("\n");

        for (int x = 10;x > 0; x--){
            System.out.println(x);
            x--;
        }
        System.out.println("\n");

        for(int i = 10; i > 0; i-=2){
            System.out.println(i);
        }
        //Best way to print all even numbers
        System.out.println("\n");
        for(int j = 10; j > 0;j--){
            if(j%2 == 0){
                System.out.println(j);
            }
        }
        System.out.println("\n");

        for(int j = 10; j > 0;j--){
            if(j == 5){
                break;
            }
            System.out.println(j);
        }
        System.out.println("\n");

        for(int z = 1; z < 6; z++){
            if (z == 3){
                break;
            }
            System.out.println(z);
        }
        System.out.println("\n");

        int y = 0;

        while (y < 10){
            System.out.println(y);
            y++;
        }
        System.out.println("\n");
        int z = 11;
        while(z > -1){
            System.out.println(z);
            z--;
        }
        double monthlyPayment = 1542.69854;
        double roundedMonthlyPayment = Math.round(monthlyPayment * 100.00) / 100.00;
        System.out.println(roundedMonthlyPayment);
        //for ()
        //Do not type anything below
    }
}
