package week10.day1.ex1;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return "Circle with perimeter: " + getPerimeter() + ", area: " + getArea();
    }

    @Override
    public void draw(){
        System.out.println("        *       ");
        System.out.println("   *        *   ");
        System.out.println(" *           *  ");
        System.out.println(" *           *  ");
        System.out.println("   *        *   ");
        System.out.println("        *       ");
    }
}
