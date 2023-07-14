package week9.day4;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString(){
        return "Rectangle with perimeter: " + getPerimeter() + ", area: " + getArea();
    }

    @Override
    public void draw(){
        for(int i=1; i<= width; i++){
            for(int j=1; j<=length; j++){
                if(i == 1 || j == 1 || i == width || j == length)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
