package week8.day1;

import java.lang.Math;
import week6.day1.Methods_1;
import week7.day4.Rectangle;

public class TestStaticMethods {

    public static void main(String[] args) {

        //we call this method directly
        //because it is static(no need to create objects)
        System.out.println(Methods_1.findSumInRange(10, 20));

        //we call pow() method directly also
        //because it is also static
        System.out.println(Math.pow(3, 2));

        //but getPerimeter method is not static
        //so we need to create an object of Rectangle class first
        //and only from the object I can call this method
        Rectangle r1 = new Rectangle(5, 3);
        System.out.println(r1.getPerimeter());



    }
}
