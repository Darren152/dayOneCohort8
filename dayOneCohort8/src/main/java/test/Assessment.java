package test;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Assessment {

    public static double squared(double value) {
        //double k = 4;
        double resultOfKSquared = Math.pow(value, 2);

        return resultOfKSquared;
    }

    public static boolean question20() {
        int i;
        for (i = 45; i > 0; i--) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Year");
                System.out.println("Up");
                System.out.println("YearUp");
                break;
            }
            System.out.println(i);
        }
        return true;
    }

    public static void question21(){

        for(int i = 45; i > 0; i--){
            System.out.println(i);
            if(i%3 == 0){
                System.out.println("Year");
            }
            if(i%5 == 0){
                System.out.println("Up");
            }
            else if (i%3 == 0 && i%5 == 0){
                System.out.println("YearUp");
            }
        }
    }

    public static double twoParameters(double price, double discount) {

        //price = 100.0;
        //discount =(1/100)*(10);
        double totalPrice = discount * price;
        return totalPrice;
    }

    public static int remainder() {
        int num = 118 % 31;
        return num;
    }

    public static int stringLengthMethod() {
        String java = "LearningJavaIsFun";
        int javaLength = java.length();
        return javaLength;
    }

    public static int myIntMethod() {
        return 1007;
    }

    public static void main(String[] args) {
        System.out.println("Question: 1");

        int dog = 10, fish = 15, bird = 15;
        int resultDogFish = dog + fish;
        int resultDogBird = dog + bird;
        int resultDogBirdFish = resultDogFish + bird;
        System.out.println(resultDogBirdFish);

        System.out.println("\n");

        System.out.println("Question 2:");

        int b = 5;
        int y = (5 * 5) + 100;

        System.out.println(y);

        System.out.println("\n");

        System.out.println("Question 3:");

        int x = 2;
        int xResult = (3 * x) + (x * 2) - 5;
        System.out.println(xResult);

        System.out.println("\n");

        System.out.println("Question 4:");

        String firstName = "Beyonce";
        String lastName = "Carter";
        String name = firstName + lastName;
        System.out.println("FirstName : " + firstName);
        System.out.println("LastName : " + lastName);

        System.out.println("\n");

        System.out.println("Question 5:");

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int arrayMultiplied = array1[3] * array2[1];
        int arrayDivided = arrayMultiplied / array1[1];

        System.out.println(arrayMultiplied);
        System.out.println(arrayDivided);

        System.out.println("\n");

        System.out.println("Question 6:");

        String read = "It was all a dream, used to read wuddup magazines";
        System.out.println(read.substring(37, 40).toUpperCase());

        System.out.println("\n");

        System.out.println("Question 7:");
        int area = 375;
        int height = 25;
        int baseOfTriangle = area / height;
        System.out.println(baseOfTriangle);

        int area1 = (height * baseOfTriangle) / 2;
        System.out.println(area1);

        System.out.println("\n");

        System.out.println("Question 8:");

        System.out.println(myIntMethod());

        System.out.println("\n");

        System.out.println("Question 9:");

        System.out.println(stringLengthMethod());

        System.out.println("\n");

        System.out.println("Question 10:");

        System.out.println(remainder());

        System.out.println("\n");

        System.out.println("Question 11:");

        System.out.println(squared(4));

        System.out.println("\n");

        System.out.println("Question 12:");

        int i;
        for (i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("\n");

        System.out.println("Question 13:");

        int t = 10;
        while (t > 0) {
            if (t == 5) {
                break;
            }
            t -= 2;
            System.out.println(t);
        }

        System.out.println("\n");
        /*
        System.out.println("Question 14:");
        int j = 1;
        while(j <= 50){
            if(j%1 == 0) {
                System.out.println(j);
            }
        }
        */
        System.out.println("\n");

        System.out.println("Question 15:");
        int u = 27, m = 48;

        int endResult = (u * 2) + m + 35;
        System.out.println("f(27,48) = " + endResult);

        System.out.println("\n");

        System.out.println("Question 17:");

        String[] listOfNames = {"Drake", "Kendrick", "Juice Wrld", "Naz", "Slum"};

        for (i = 0; i <= listOfNames.length - 1; i++) {
            System.out.print(listOfNames[i] + ", ");
        }


        System.out.println("\n");

        System.out.println("Question 18:");

        Random gradeNumGenerator = new Random();

        int low = 0;
        int high = 100;
        int result = gradeNumGenerator.nextInt(high - low) + low;

        if(result > 91){System.out.println("This Student Gets a A: " + result);}
        else if(result > 81){System.out.println("This Student Gets a B: " + result);}
        else if(result > 74){System.out.println("This Student Gets a C: " + result);}
        else if(result > 64){System.out.println("This Student Gets a D: " + result);}
        else {System.out.println("This Student Gets a F: " + result);
        }

        System.out.println("\n");

        System.out.println("Question 19:");

        System.out.println(twoParameters(150, .10));

        System.out.println("\n");

        System.out.println("Question 20:");

        System.out.println(question20());

        question21();
        
    }
}

