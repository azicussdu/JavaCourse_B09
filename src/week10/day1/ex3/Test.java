package week10.day1.ex3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();

        Car c1 = new Car("red", 2022, true, "Toyota");
        Truck t1 = new Truck("black", 2020, false, 500.5);

        list.add(c1);
        list.add(t1);

        showInfo(t1);
        showInfo(c1);
    }

    public static void showInfo(Vehicle v){
        System.out.println(v.getColor() + " - " + v.getYear());
    }
}
