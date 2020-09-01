import java.util.Objects;
import java.util.Random;
import java.util.ArrayList;

public class AfterClass {
    public static void main(String[] args) {

        double balance = 20000.01;
        double amountToWithdraw = 5000.01;
        System.out.println(amountToWithdraw > balance);//Will Print True or False Depending on the Operator Being Used.
/*
        double myBalance = 200.05;
        double costOfBuyingNewLaptop = 1000.05;
        boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;//You can save the result of a comparison as a boolean.
*/
        double myBalance = 23000.48;
        double costOfNewCar = 40000.00;
        boolean canBuyCar = myBalance >= costOfNewCar;
        System.out.println(canBuyCar);
        //System.out.println(canBuyCar);

        //Equals amd Not Equals
        double balance2 = 20000.0;
        double amountToDeposit = 620;
        double updatedBalance = balance2 + amountToDeposit;
        boolean balanceHasChanged = balance2 != updatedBalance;
        System.out.println(balanceHasChanged);
        /*
        With objects, such as Strings, we can’t use the primitive equality operator.
        To test equality with Strings, we use a built-in method called .equals().
        */
        String user1 = "Darren121";
        String user2 = "Darren032";
        String user3 = "Darren120";
        int buyFirst = 24;
        int sellFirst = 24;
        System.out.println(user1.equals(user2));
        System.out.println(Objects.equals(user3, user1));
        System.out.println(user3.equals(user1));
        System.out.println(buyFirst == sellFirst);
        System.out.println(Objects.equals(buyFirst, sellFirst));


        int animals = 12;
        String species = "zebra";
        String zooDescription = "Our zoo has " + animals + " " + species + "s!";
        System.out.println(zooDescription);

        double balance3 = 1000.75;
        double amountToWithdraw3 = 250;
        double updatedBalance3 = balance3 - amountToWithdraw3;
        double amountForEachFriend = updatedBalance3 / 3;
        boolean canPurchaseTicket = amountForEachFriend >= 250;

        System.out.println("I gave each friend " + amountForEachFriend + "...");
        String iGave = "I gave each friend " + amountForEachFriend + "...";
        System.out.println(iGave);

        //A loop is a programming tool that allows developers to repeat the same block of code until some condition is met.

        //a 'for' loop is different than a 'for-each' loop.
        Random randomGenerator = new Random();

        // Generate a number between 1 and 6
        int dieRoll = randomGenerator.nextInt(6) + 1;
        while (dieRoll != 5) {
            System.out.println(dieRoll);
            dieRoll = randomGenerator.nextInt(6);
        }
        System.out.println(" ");
        int cats = 4, dogs = 7;
        while (cats <= dogs) {
            cats++;
            System.out.println(cats);
        }
        System.out.println(" ");

        int cupsOfCoffee = 1;
        //int i = cupsOfCoffee;
        for (int i = 1; i <= 100; i++) {
            System.out.println("Fry drinks cup of coffee #" + i);

        }


        ArrayList<Double> expenses = new ArrayList<Double>();
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);

        double total = 0, total2 = 0;

        //Completed with a FOR EACH LOOP!
        for(double num : expenses.toArray(new Double[0])){
        total = total+num;
        }
        System.out.println("\nTotal of Array List Expenses: "+total);
        System.out.println(expenses.size());

        //Completed using a FOR LOOP!
        int i;
        for(i = 0;i < expenses.size(); i++){
            total2 +=expenses.get(i);
        }
        System.out.println(total2);

        //Sorting through Array to find Min and Max int(Smallest and Larget Number).
        int bigArray[] = {23,45,71,12,43,7,8,7,12,104};

        int smallest = bigArray[0];
        int largest = bigArray[0];

        for (i = 0; i <= 9; i++){
            if(bigArray[i] < smallest) smallest = bigArray[i];
            if(bigArray[i] > largest) largest = bigArray[i];
        }System.out.println("This is the smallest number in the Array: "+ smallest);
         System.out.println("This is the smallest number in the Array: " + largest);


         int x = 4;
         int y = 1;
         do{
             System.out.println(x);
         }while(x > 17);

         //Will print an infinite amount of times.
         while (x == 4){
             System.out.println(x);
         }

         while (x < y){
             System.out.println(x);
             y++;
         }

         //for

            // Java program to demonstrate
            // use of .equals operator in Java



                // Get some Strings to compare
                String s1 = "A";
                String s2 = "A";
                String s3 = "a";
                String s4 = new String("A");

                // Compare s1 and s2
                // It should return true as they both
                // have the same content
                System.out.println(s1 + " .equals " + s2
                        + ": " + s1.equals(s2));

                // Compare s1 and s3
                // It should return false as they both
                // have the different content
                System.out.println(s1 + " .equals " + s3
                        + ": " + s1.equals(s3));

                // Compare s2 and s3
                // It should return false as they both
                // have the different content
                System.out.println(s2 + " .equals " + s3
                        + ": " + s2.equals(s3));

                // Compare s1 and s4
                // It should return true as they both
                // have the same content
                System.out.println(s1 + " .equals " + s4
                        + ": " + s1.equals(s4));


    }
}
