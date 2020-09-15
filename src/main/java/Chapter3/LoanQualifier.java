package Chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYears = 2;

        //Get what we don't
        System.out.println("Enter your Salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How many years have you been employed with current employer: ");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requiredSalary){
            if(years >= requiredYears){
                System.out.println("You can get a loan.");
            }else {
                System.out.println("Sorry, you must have worked at your current job for "+ requiredYears +" years.");
            }
        }else {
            System.out.println("Sorry, you must earn at least "+ requiredSalary +" to qualify for this loan.");
        }

    }
}
