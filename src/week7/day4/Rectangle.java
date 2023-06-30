package week7.day4;

public class Rectangle {
    int length;
    int width;

    public Rectangle(){
        length = 1;
        width = 1;
    }

    public Rectangle(int n){
        length = n;
        width = n;
    }

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