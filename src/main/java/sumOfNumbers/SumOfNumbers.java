package sumOfNumbers;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        System.out.println("input =" + input);

        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        System.out.println(sum);

        do {
            System.out.println("Input a number: ");
            userInput = new Scanner(System.in);
            input = userInput.nextInt();
            System.out.println("input =" + input);

            sum = 0;

            for (int i = 0; i <= input; i++) {
                sum += i;
            }
            System.out.println(sum);

    }while(input != -1);

    }
}
