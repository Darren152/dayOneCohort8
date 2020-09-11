package sumOfNumbers;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int mysteryNumber = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the Mystery number.");
        System.out.println("*Hint its between 1 and 100");
        int userInput = input.nextInt();
        int duplicateNumber = userInput;
        int timesGuessed = 0;
        timesGuessed++;
        while (userInput != mysteryNumber) {
            if (userInput < mysteryNumber) {
                System.out.println("User input: "+userInput);
                System.out.println("User guess was too low! Try again!");
                System.out.println("User guesses so far: "+timesGuessed);
                userInput = input.nextInt();
                if (userInput != duplicateNumber) {
                    timesGuessed++;
                }
                duplicateNumber = userInput;
            }
            if (userInput > mysteryNumber) {
                System.out.println("User input: "+userInput);
                System.out.println("User guess was too high! Try again!");
                System.out.println("User guesses so far: "+timesGuessed);
                userInput = input.nextInt();
                if (userInput != duplicateNumber) {
                    timesGuessed++;
                }
                duplicateNumber = userInput;
            }

        }
        timesGuessed--;
        System.out.println("Total number of guesses was: "+timesGuessed);

    }
}
