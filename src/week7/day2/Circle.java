package week7.day2;

public class Circle {
    int radius;
    final double PI = 3.14; //constant (uppercase)

    public double getPerimeter(){
        double perim = 2 * PI * radius;
        return perim;
    }

    public double getArea(){
        double area = PI * radius * radius;
        return area;
    }
}
