package week9.day4;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(3, 5);
        Square sqr = new Square(5);
        Circle cir = new Circle(3);
        Square sqr2 = new Square(4);
        Circle cir2 = new Circle(5);
        Rectangle rect2 = new Rectangle(4, 6);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rect);
        shapes.add(sqr);
        shapes.add(cir);
        shapes.add(rect2);
        shapes.add(sqr2);
        shapes.add(cir2);

        double totalArea = 0;
        for(Shape sh : shapes){
            if(sh instanceof Rectangle){
                System.out.println(sh.getArea());
                totalArea = totalArea + sh.getArea();
            }
        }
        System.out.println("total area: " + totalArea);
    }
}
