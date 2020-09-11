import java.text.NumberFormat;
import java.util.Scanner;

public class ContinuingJava{
    public static double totalCostOfLoan(int months, double monthlyRate){
        months = 360;
        double total = months * monthlyRate;
        return total;
    }

    public static double calculateMonthlyPayment(
            int loanAmount, int termInYears, double interestRate) {

        interestRate /= 100.0;

        double monthlyRate = interestRate / 12.0;

        int termInMonths = termInYears * 12;

        double monthlyPayment =
                (loanAmount * monthlyRate) /
                        (1 - Math.pow(1 + monthlyRate, -termInMonths));
        return monthlyPayment;
    }

    public static void main(String[] args) {

        // Scanner is a great class for getting
        // console input from the user

        Scanner scanner = new Scanner(System.in);

        // Prompt user for details of loan
        int loanAmount = 450000;
        System.out.print("Loan amount: " + loanAmount);
        //int loanAmount = scanner.nextInt();
        int termInYears = 30;
        System.out.print("Loan term: " + termInYears + " years");
        //int termInYears = scanner.nextInt();
        double interestRate = 0.0375;
        System.out.print("Interest rate: " + interestRate);
        //double interestRate = scanner.nextDouble();

        // Display details of loan

        double monthlyPayment =
                calculateMonthlyPayment(loanAmount, termInYears, interestRate);

        //double totalPayment = totalCostOfLoan(months, monthlyRate);


        // NumberFormat is useful for formatting numbers
        // In our case we'll use it for
        // formatting currency and percentage values

        NumberFormat currencyFormat =
                NumberFormat.getCurrencyInstance();
        NumberFormat interestFormat =
                NumberFormat.getPercentInstance();

        // Display details of the loan

        System.out.println("Loan Amount: " +
                currencyFormat.format(loanAmount));
        System.out.println("Loan Term: " +
                termInYears + " years");
        System.out.println("Interest Rate: " +
                interestFormat.format(interestRate));
        System.out.println("Monthly Payment: " +
                currencyFormat.format(monthlyPayment));

        //System.out.println("Total Loan Amount: "+ );
        System.out.println("\n");
        String[] color = {"Red","Blue","Green","Orange","Yellow"};

        int k;
        for(k = 0; k <= 3; k++){

            switch (k) {
                case 0 -> System.out.println(color[0]);
                case 1 -> System.out.println(color[1]);
                case 2 -> System.out.println(color[2]);
                case 3 -> System.out.println(color[3]);
                case 4 -> System.out.println(color[4]);
                default -> System.out.println("A color was not selected from the list.");
            }
        }
        String[] listOfNames = {"Darren Salgado","Immanuel","David Adenaike","Yasmin Herrera"};
        String lastNameOnList = listOfNames[listOfNames.length-1];
        System.out.println(listOfNames.length);
        System.out.println(listOfNames[0]);
        System.out.println(listOfNames[1]);
        System.out.println(listOfNames[2]);
        System.out.println(listOfNames[3]);
        //System.out.println(listOfNames[4]);
        //System.out.println(lastNameOnList);
        listOfNames[3] = "Roy";
        System.out.println(listOfNames[3]);

    }
}