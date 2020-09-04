package calcproject;

import java.lang.*;

public class Calculator {


    static double start;

    public static double add(double input){
        //logic should keep the previous number until calc hits clear.
        start += input;

        System.out.println("Current Number: "+start);
        return start;
    }

    public static double subtract(double input){
        //logic should keep the previous number until calc hits clear.
        start -= input;

        System.out.println("Current Number: "+start);
        return start;
    }

    public static double multiply(double input){
        //logic should keep the previous number until calc hits clear.
        start *= input;

        System.out.println("Current Number: "+start);
        return start;
    }

    public static double divide(double input){
        //logic should keep the previous number until calc hits clear.
        start /= input;
        if (input == 0){
            System.out.println("Err");
            System.out.println("Current Number: Err");
            start = 0;
        }
        System.out.println("Current Number: "+start);
        return start;
    }

    public static double exponent(double input, double secondInput){
        //logic should keep the previous number until calc hits clear.
        //start = 0;
        start = 0;
        start += Math.pow(input,secondInput);

        System.out.println("Current Number: "+start);
        return start;
    }

    public static String clear(String userInput){
        //logic should keep the previous number until calc hits clear.
        userInput= "clear";
        start = 0;
        System.out.println("Current Number: "+start);
        return String.valueOf(0);
    }

    public static double square(double input){
        //logic should keep the previous number until calc hits clear.
        start *= start;
        System.out.println("Current Number: "+start);
        return start;
    }

    public static double squareRoot(double input){
        //logic should keep the previous number until calc hits clear.
        start = Math.sqrt(start);
        System.out.println("Current Number: "+start);
        return start;
    }

    public static double invert(double input){

        start *= -1;

        System.out.println("Current Number: "+start);

        return start;
    }

    public static double inverse(double input){
        //logic should keep the previous number until calc hits clear.
        //start = 0;

        start *= 1 / start;

        //start += Math.pow(start, -1);

        System.out.println("Current Number: "+start);
        return start;
    }

    public static void main(String[] args) {

        System.out.println(add(4));

        System.out.println(subtract(2));

        System.out.println(multiply(3));

        System.out.println(divide(2));

        System.out.println(divide(0));

        System.out.println(clear("clear"));

        System.out.println(add(5));

        System.out.println(square(start));

        System.out.println(squareRoot(start));

        System.out.println(invert(start));

        System.out.println(clear("clear"));

        System.out.println(add(7));

        System.out.println(inverse(start));

        System.out.println("Current Number: "+start);

        //System.out.println(exponent(4,2));


        //System.out.println(exponent(4,2));

    }

}
