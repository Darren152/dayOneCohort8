//Question 5
public class Main{
    public static Integer countTriple(String input) {

        int trippleCount = 0;
        for (int i = 0; i < input.length()-1; i++){
            if (input.charAt(i) == input.charAt(i+1) && input.charAt(i+1) == input.charAt(i+2)){
                trippleCount++;
            }
        }
        return trippleCount;
    }

    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc"));
        System.out.println(countTriple("xxxabyyyycd"));
        System.out.println(countTriple("a"));
    }
}
//Question 4
//public class Main{
//
//    public static boolean gIsHappy(String input) {
//
//        boolean happyG = false;
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == 'g') {
//                if (i <= input.length() -2) {
//                    if (input.charAt(i +1) == 'g') {
//                        happyG = true;
//                    } else if (i > 0) {
//                        if (input.charAt(i -1) == 'g') {
//                            happyG = true;
//                        }else return false;
//                    }else return false;
//                }
//            }
//        }
//        return happyG;
//    }
//    public static void main(String[] args) {
//
//        System.out.println(gIsHappy("xxggyygxx"));
//        System.out.println(gIsHappy("xxgxx"));
//        System.out.println(gIsHappy("xxggxx"));
//    }
//}

//Question 3
//public class Main {
//
//    public static boolean containsEqualNumberOfIsAndNot(String input) {
//
//        int isCounter = 0;
//        int notCounter = 0;
//        boolean answer;
//        for (int index = 0; index < input.length(); index++) {
//            if (input.charAt(index) == 'i' && input.charAt(index + 1) == 's') {
//                isCounter++;
//            } else if (input.charAt(index) == 'n' && input.charAt(index + 1) == 'o' && input.charAt(index + 2) == 't') {
//                notCounter++;
//            }
//            if (notCounter == isCounter) {
//                answer = true;
//            }
//        }return (isCounter == notCounter);
//    }
//        public static void main (String[]args){
//            System.out.println(containsEqualNumberOfIsAndNot("is not equal"));
//            System.out.println(containsEqualNumberOfIsAndNot("is notnot"));
//        }
//}

//Question 2
//public class Main {
//    public static String removeString(String base, String remove) {
//        String answer = base;
//        if(base.contains(remove)) {
//            answer = base.replace("o", "");
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        String Hello = "How are you today";
//        System.out.println(removeString(Hello,"o"));
//    }
//}

//Question 1
//public class Main {
//
//    public static Integer countYZ(String str) {
//        int count = 0;
//        String temp[] = str.split(" ");
//        for (int i = 0; i < temp.length; i++) {
//            if (temp[i].trim().endsWith("y") || temp[i].trim().endsWith("z"))
//                count++;
//        }
//        return count;
//    }
//
//    public static void main(String[] args){
//        String asshole = "Hello my name is zebra and my belly is big";
//        System.out.println(countYZ(asshole));
//    }
//}

//public class Main {
//
//    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
//        //Type your code here
//        StringBuilder str = new StringBuilder("0,");
//        //str.append(0).append(",");
//        int num1 = 0, num2 = 1;
//        int sumOfPrevTwoNums = 0;
//        for(int i = 1; sumOfPrevTwoNums <= maxnumber; i++){
//            //System.out.print(num1+",");
//            sumOfPrevTwoNums = num1 + num2;
//            num1 = num2;
//            num2 = sumOfPrevTwoNums;
//            str.append(num1).append(",");
//        }
//        //System.out.println("test");
//        str.deleteCharAt(str.length()-1);
//        return str.toString();//String.valueOf(maxnumber);
//    }
//
//    // DO NOT TYPE BELOW HERE!!!
//    public static void main(String[] args){
//        createStringOfFibonnaciUpToMax(9);
//        System.out.println(createStringOfFibonnaciUpToMax(9));
//    }
//}
//Question Replace WuTang Two Three Divisible
//import java.util.Arrays;
//public class Main {
//
//    public static String replaceWuTangTwoThreeDivisible(String stringInput) {
//        //Type your code here
//        //Create a string array
//        //S2 : use split method
//        //S3 : loop through
//        //S4 : setup if statments one for wu and one for tang.
//        //S5 : create new string for final output
//        //S6 : initialize new string for final answer .
//        //S7 : cut out trash.
//
//        //String[] wuTang;
//        String[] wuTang = stringInput.split(" ");
//        for (int i = 0; i < wuTang.length; i++){
//            if ((i+1) % 2 == 0){
//                wuTang[i] = "Wu";
//            }else if ((i+1)% 3 == 0){
//                wuTang[i] = "Tang";
//            }
//        }
//        String su = Arrays.toString(wuTang).replace("[", "").replace("]", "").replace(",", "");
//        return su;
//    }
//
//    // DO NOT TYPE BELOW HERE!!!
//    public static void main(String[] args){
//        replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence");
//        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
//    }
//
//}



//public class Main{
//
//    public static int printLargest(int[] ar) {
//
//        int largest = ar[0];
//
//        for(int i = 0; i <= 5; i++){
//            if (ar[i] > largest) largest = ar[i];
//        }System.out.println("This is the largest number in the array: "+largest);
//        return largest;
//    }
//
//    public static void main(String[] args){
//        int[] numArr = {100,10,787,74,614,21};
//        printLargest(numArr);
//    }
//}


//public class Main{
//
//    public static String printOddNumbersInRange(int start, int end){
//        String result = "";
//        //DO NOT TYPE BELOW HERE
//        //Type your code here
//        start = 19;
//        while(start >= 3){
//
//            if (start % 2 != 3){
//                System.out.print(start);
//                start-=2;
//            }
//        }
//        return result;
//    }
//
//    //Don't touch below here
//    public static void main(String[] args){
//        printOddNumbersInRange(15,3);
//    }
//}

