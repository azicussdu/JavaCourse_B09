package week10.day1.ex2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();

        list.add(new Cow("red", Breed.HEREFORD));
        list.add(new Monkey("red", true));
        list.add(new Dolphin("red", true));

        for(Animal a : list){
            a.eat(Food.GRASS);
            a.sleep();
        }
    }
}
