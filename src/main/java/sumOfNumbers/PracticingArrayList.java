package sumOfNumbers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.Console;
public class PracticingArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> numbersUsed = new ArrayList<Integer>();
        System.out.println("Type in a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        int endProgram = -1;
        numbersUsed.add(userInput);
        int timesGuessed = 0;

        while (userInput != endProgram){
            System.out.println("Type in a number: ");
            input = new Scanner(System.in);
            userInput = input.nextInt();
            endProgram = -1;
            int duplicateNum = userInput;
            if (userInput == endProgram){
                break;
            }
            for(int i = 0; i < numbersUsed.size(); i++) {
                if (numbersUsed.contains(duplicateNum)) {

                }
            }

            }
                numbersUsed.add(userInput);
                Collections.sort(numbersUsed);
        System.out.println(numbersUsed);
        }
//        System.out.print("Type in a number: ");
    }

