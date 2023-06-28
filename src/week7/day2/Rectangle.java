package week7.day2;

public class Rectangle {
    int length;
    int width;

    public int getPerimeter(){
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    public int getArea(){
        int area = length * width;
        return area;
    }
}
