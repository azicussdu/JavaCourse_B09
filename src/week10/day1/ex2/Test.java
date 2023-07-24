package week10.day1.ex2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<Animal> list = new ArrayList<>();

        Cow cow1 = new Cow("red", Breed.HEREFORD);
        Cow cow2 = new Cow("brown", Breed.BRAHMAN);
        Monkey mon1 = new Monkey("red", true);
        Monkey mon2 = new Monkey("grey", true);
        Dolphin dol1 = new Dolphin("red", true);
        Dolphin dol2 = new Dolphin("grey", false);

        list.add(cow1);
        list.add(cow2);
        list.add(mon1);
        list.add(mon2);
        list.add(dol1);
        list.add(dol2);

        for(Animal anml : list){
            anml.eat(Food.GRASS);
            anml.sleep();
        }
    }
}
