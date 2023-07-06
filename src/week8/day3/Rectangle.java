package week8.day3;

public class Rectangle {
    public int length;
    public int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getPerimeter(){
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    public int getArea(){
        int area = length * width;
        return area;
    }
}