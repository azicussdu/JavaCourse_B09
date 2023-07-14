package week9.day4;

public class Square extends Rectangle {
    public Square(double sideLength){
        super(sideLength, sideLength);
    }

    public String toString(){
        return "Square with perimeter: " + getPerimeter() + ", area: " + getArea();
    }
}
