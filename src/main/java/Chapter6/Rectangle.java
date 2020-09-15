package Chapter6;

public class Rectangle {

    //protected double area;//protected means that any other class within its package can access it.
    private double width;
    private double length;//private means that it is only accessible in this class.

    public Rectangle(){//this is a default constructor. constructors must always be named after the class!
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){//You can create multiple constructors as long as the parameters are different
        this.length = length;//Can be set this way
        setWidth(width);//Or can be setup this way.
    }

    public double getLength(){//Used to get the length.
        return length;
    }

    public void setLength(double length){//Used to set the length.
        this.length = length;// this.length refers to the field length, as where the = length refers to the parameter.
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
