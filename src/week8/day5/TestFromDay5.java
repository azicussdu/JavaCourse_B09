package week8.day5;

import week8.day3.Rectangle;

public class TestFromDay5 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(8, 5);
        r1.length = 12;
        r1.width = 10;

        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
    }
}
