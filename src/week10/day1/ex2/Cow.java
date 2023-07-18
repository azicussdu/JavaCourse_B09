package week10.day1.ex2;

public class Cow extends Animal{
    private Breed breed;

    public Cow(String color, Breed breed) {
        super(color); //that's why we have constructors inside Abstract classes
        this.breed = breed;
    }

    @Override
    public void eat(Food food) {
        if(food == Food.GRASS)
            System.out.println("Okay I am eating");
    }
}

enum Breed {
    HOLSTEIN, BRAHMAN, HEREFORD, JERSEY
}
