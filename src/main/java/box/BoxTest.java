package box;

public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(4,5);
        Box box2 = new Box(4,10);
        box1.calculateArea(4,5);
        //System.out.println(box2.calculateArea(4,5));
        System.out.println(box1);
    }
}
