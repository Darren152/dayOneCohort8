import java.util.Scanner;

public class Car {
    private static int totalModelSInventory;
    private static int totalModel3Inventory;

    String color;
    String type;
    int inventory;

    // new method: constructor!
    public Car(String carColor, String carType, int numOfCars){
//        System.out.println("I am inside the constructor method.");
        color = carColor;
        type = carType;
        inventory = numOfCars;
    }

    public static int getTotalModel3Inventory(int i){
        //this.totalInventory = totalInventory;
        //inventory += Car.totalModel3Inventory;
        int inventory =0;
        totalModel3Inventory += inventory;
        return totalModel3Inventory;
    }

    public static int getTotalModelSInventory(int i){
        //this.totalInventory = totalInventory;
        //inventory += Car.totalModelSInventory;
        int inventory =0;
        totalModelSInventory += inventory;
        return totalModelSInventory;
    }

    // main method is where we create instances!
    public static void main(String[] args) {

        //System.out.println("Start of the main method.");
        //String month = "March";
        //int year = 2018;
        Scanner month = new Scanner(System.in);
        System.out.print("Enter a Month: ");
        String userMonth = month.nextLine();
        Scanner year = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int userYear = year.nextInt();

        Car model3 = new Car("Red ", "Tesla Model 3 ", 120);
        System.out.println(model3.color + model3.type + model3.inventory);
        model3 = new Car("Blue ", "Tesla Model 3 ", 120);
        System.out.println(model3.color + model3.type + model3.inventory);
        model3 = new Car("Silver ", "Tesla Model 3 ", 120);
        System.out.println(model3.color + model3.type + model3.inventory);
        model3 = new Car("Black ", "Tesla Model 3 ", 175);
        System.out.println(model3.color + model3.type + model3.inventory);
        model3 = new Car("White ", "Tesla Model 3 ", 175);
        System.out.println(model3.color + model3.type + model3.inventory);

        Car modelS = new Car("Red ","Tesla Model S ", 60);
        System.out.println(modelS.color + modelS.type + modelS.inventory);
        modelS = new Car("Blue ","Tesla Model S ", 75);
        System.out.println(modelS.color + modelS.type + modelS.inventory);
        modelS = new Car("Silver ","Tesla Model S ", 80);
        System.out.println(modelS.color + modelS.type + modelS.inventory);
        modelS = new Car("Black ","Tesla Model S ", 100);
        System.out.println(modelS.color + modelS.type + modelS.inventory);
        modelS = new Car("White ","Tesla Model S ", 100);
        System.out.println(modelS.color + modelS.type + modelS.inventory);

        String teslaModel3 = "In "+ userMonth +" of "+ userYear +" Tesla had a total inventory of "+ getTotalModel3Inventory(710) +" "+ model3.type;
        String teslaModelS = "In "+ userMonth +" of "+ userYear +" Tesla had a total inventory of "+ getTotalModelSInventory(415) +" "+ modelS.type;
//        System.out.println(model3.color + model3.type + model3.inventory);
//        System.out.println(modelS.color + modelS.type + modelS.inventory);
        System.out.println(teslaModel3);
        System.out.println(teslaModelS);


        int[] listOfNumbers = {12, 3, 89, 5, 10, 1, 32};
        int firstResult = listOfNumbers[0] + listOfNumbers[6];
        int secondResult = listOfNumbers[1] * listOfNumbers[3];
        //int thirdResult = listOfNumbers[5] = 44;
        listOfNumbers[5] = 33;//assigning a new value to the array index [5].
        System.out.println("\n"+firstResult);
        System.out.println(secondResult);
        System.out.println(listOfNumbers[5]);

//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Red");
//        cars.add("Black");
//        cars.add("Blue");
//        cars.add("White");
//        cars.add("Grey");
//        System.out.println(cars.get(0));

        //LocalDate todayDate = LocalDate.now();  // Create a date object
        //System.out.println(todayDate);  // Display the current date

        // create the instance below

        // print the instance below

    }



}