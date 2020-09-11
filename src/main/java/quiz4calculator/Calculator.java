package quiz4calculator;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Calculator {

    public static Double add(Double val1, Double val2) {
        //Double sum = val1 + val2;
        return val1 + val2;
    }

    //return the sum of val1 and val2
    public static Double subtract(Double val1, Double val2) {
        return val1 - val2;
    }

    //return the difference of val1 and val2
    public static Double divide(Double val1, Double val2) {
        Double divided = val1 / val2;
        return divided;
    }

    //return the quotient of val1 and val2
    public static Double squareRoot(Double value) {
        double squareRooted = Math.sqrt(value);
        return squareRooted;
    }

    //return the square root of value
    public static Double square(Double value) {
        Double square = Math.pow(value, 2);
        return square;
    }
//return the square of value

    public static Double[] squareRoutes(Double[] values) {
        Double[] root = new Double[values.length];
        for (int i = 0; i < values.length; i++) {
            root[i] = Math.sqrt(i);
        }
        return root;
    }

    //return an array of Double, containing the square root of each of the elements in values.
    public static Double[] squares(Double[] values) {
        Double[] squared = new Double[values.length];
        for (int i = 0; i < values.length; i++) {
            squared[i] = Math.pow(i, i);
        }
        return squared;
    }

    //return an array of Double, containing the square of each of the elements in values.
    public static void main(String[] args) {
        Double[] listOfNumbers = {3.3,2.4,5.1,7.8};
        System.out.println(subtract(4.0,5.3));
        System.out.println(divide(10.2,2.4));
        System.out.println(add(4.2,3.3));
        System.out.println(square(4.2));
        System.out.println(squareRoot(4.4));
        System.out.println(Arrays.toString(squareRoutes(listOfNumbers)));
        System.out.println(Arrays.toString(squares(listOfNumbers)));
    }
}
