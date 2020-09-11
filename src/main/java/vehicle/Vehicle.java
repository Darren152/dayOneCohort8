package vehicle;

public class Vehicle {
    public int speed;
    public String color;
    public String name;

    public Vehicle(int speed, String color, String name){
        this.speed = speed;
        this.color = color;
        this.name = name;
    }

    public void carInfo(){
        System.out.println("The "+color+" "+ name+" drove at "+ speed +" mph.");
    }

}
