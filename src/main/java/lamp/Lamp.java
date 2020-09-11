package lamp;

public class Lamp {
    public boolean on;
    public boolean off;

    public Lamp(boolean off){
        this.off = off;
    }
    public void turnOn(){
        System.out.println("turning on");;
    }

    public void turnOff(){
        System.out.println("turning off");
    }
}
