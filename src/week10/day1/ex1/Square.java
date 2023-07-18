package week10.day1.ex1;

public class Square extends Rectangle {

    @Override
    public double getArea(){
        return getLength() * getWidth();
    }

    public Square(double sideLength){
        super(sideLength, sideLength);
    }

    public String toString(){
        return "Square with perimeter: " + getPerimeter() + ", area: " + getArea();
    }
}
