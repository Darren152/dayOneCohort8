package Chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;//All caps means constant variable

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){
            int randomNumber;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on teh array to find a value.
     * @param array Array to search through.
     * @param numberToSearchFor The value to search for.
     * @return true if found false if not.
     */
    public static boolean search(int[] array, int numberToSearchFor){

        //This is called an enhanced loop.
        for(int value : array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int numbersToSearchFor){

        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numbersToSearchFor);
        if ( index >= 0) {
            return true;
        }else return false;
    }

    public static void printTicket(int[] ticket){
        for(int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
