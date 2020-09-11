package box;

public class Box {
    public int length;
    public int width;

    public Box(int length,int width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(int length, int width){
        System.out.println(length*width);
    }
}
