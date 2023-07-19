package week10.day2.ex1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //IS-A relationship (so Circle, Rectangle or Square can be used as IShape)
        ArrayList<IShape> list = new ArrayList<>();

        Circle c = new Circle(3);
        list.add(c);

        Rectangle r = new Rectangle(5, 8);
        list.add(r);

        Square s = new Square(10);
        list.add(s);

        for(int i=0; i<list.size(); i++){
            list.get(i).draw();
        }

    }
}
