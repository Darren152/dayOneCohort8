import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Do Not Type Above This Line!

        //Question 1:
        //a = b3 - 6
        //if b=3, then a =_?
/*
        int b = 3, c = 6, d = 3;
        int a = (b * d) - c;
        String questionOne = ("(3 * 3) - 6 = " + a);
        System.out.println("Question 1 Answer:");
        System.out.println(questionOne);
*/
        //Question 2:
        //q = 2j + 20
        //if j=5, then q =_?
/*
        int j = 5;
        int q = (2 * j) + 20;
        String questionTwo = ("(2 * 5) + 20 = " + q);
        System.out.println("Question 2 Answer:");
        System.out.println(questionTwo);
*/
        //Question 3:
        //g = e2 + 21 - f5
        //e=7, f=4
/*
        int e = 7, f = 4;
        int g = (e * 2) +21 -(f *5);
        String questionThree = ("(7 * 2) + 21 - (4 * 5) = " + g);
        System.out.println("Question 3 Answer:");
        System.out.println(questionThree);
*/
        //Question 4:
        //w = z0.4 - h + i7
        //z=23, h=13.4, i=0.65

        double z = 2;
        double h = 13.4, i = 0.65;
        double w = (z * 0.4) - 13.4 + (i * 7);
        String questionFour = ("(23 * 0.4) -13.4 +(-0.65 * 7) = " + w);
        System.out.println("Question 4 Answer: \n" + questionFour);

        System.out.println("\n");

        //Question 5:
        //f(y)=5y+y'3-7
        //y(2)=?

        double y = 2;
        double resultY = y * 2;
        double resultB = (5 * y) + Math.pow(y,3) - 7;
        System.out.println(resultY);
        System.out.println(resultB);


        int f = 7, g = 7;
        String areTheSame = ("\nf and g are the same");
        if (f > g) {
            System.out.println(f);
        }
        else if (f == g) {
            System.out.println(areTheSame);
        }
        else
            System.out.println(g);

        double radius = 10;
        double circumference = 2 * radius * Math.PI;
        double circumferenceRounded = Math.round(circumference*100.00)/100.00;
        System.out.println("\nCircumference of Circle When Radius equals " + radius + " circumference = " + circumferenceRounded);

        System.out.println("\n");

        String word = "Hello";
        System.out.println(word.charAt(0));
        //used to get the last element in the string
        System.out.println(word.charAt(word.length()-1));

        //SubString Method
        String biggie = "Christopher";

        System.out.println(biggie.substring(8,11).toUpperCase());
        System.out.println(biggie.substring(4,8));

        System.out.println("\n");

        String[] listOfNames = {"Darren Salgado","Immanuel","David Adenaike","Yasmin Herrera"};
        String lastNameOnList = listOfNames[listOfNames.length-1];
        System.out.println(listOfNames.length);
        System.out.println(listOfNames[0]);
        System.out.println(listOfNames[1]);
        System.out.println(listOfNames[2]);
        System.out.println(listOfNames[3]);
        System.out.println(listOfNames[4]);
        System.out.println(lastNameOnList);
        System.out.println("\n");
        listOfNames[3] = "Roy";
        System.out.println(listOfNames[3]);
        //System.out.println(Arrays.toString(listOfNames));
        int[] listOfNumbers = {12, 3, 89, 5, 10, 1, 32};
        int firstResult = listOfNumbers[0] + listOfNumbers[6];
        int secondResult = listOfNumbers[1] * listOfNumbers[3];
        //int thirdResult = listOfNumbers[5] = 44;
        listOfNumbers[5] = 44;//assigning a new value to the array index [5].
        System.out.println("\n"+firstResult);
        System.out.println(secondResult);
        System.out.println(listOfNumbers[5]);

        int partyAge = 17;
        if (partyAge >= 18){
            System.out.println("\nWelcome to the party!");
        }
        else
            System.out.println("\nYou're Under Age!");

        partyAge = 18;

        int k;
        for(k = 0; k <= 4; k++){

            switch(k){
                case 0:
                    System.out.println(listOfNames[0]);
                    break;
                case 1:
                    System.out.println(listOfNames[1]);
                    break;
                case 2:
                    System.out.println(listOfNames[2]);
                    break;
                case 3:
                    System.out.println(listOfNames[3]);
                    break;
                case 4:
                    System.out.println(listOfNames[4]);
                    break;
                default:
                    System.out.println("There are no names on this list.");
                    break;
            }
        }


        switch(partyAge){
            case 18:
                System.out.println("\nWelcome to the party!");
                break;
            default:
                System.out.println("\nYou're Under Age!");
                break;
        }


//        //(a + b) = (c * d)
//        int a = 3, b = 6, c = 3, d = 3;
//        int answerA = (a+b);
//        int answerL = (c*d);
//        if (answerA == answerL){
//            System.out.println("\nProblem Solved!");
//        }
//
//        int o;
//        for (o = 0; o < 64; o++) {
//
//            System.out.println(o);
//        }


        // Do Not Type Below This Line!


        }



}

