package Chapter6;

public class Month {

    public static String getMonth(int month){
        return switch (month) {
            case 1 -> "January";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "Aug";
            case 9 -> "Sep";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default -> "Invaild month. Please enter a value between 1 and 12";
        };
    }

    public static  int getMonth(String month){
        return switch (month) {
            case "Jan" -> 1;
            case "Feb" -> 2;
            case "Mar" -> 3;
            case "Apr" -> 4;
            case "May" -> 5;
            case "Jun" -> 6;
            case "Jul" -> 7;
            case "Aug" -> 8;
            case "Sep" -> 9;
            case "Oct" -> 10;
            case "Nov" -> 11;
            case "Dec" -> 12;
            default -> -1;
        };
    }
}
