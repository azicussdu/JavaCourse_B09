package week10.day1.ex2;

public abstract class Animal {
    private String color; //to be inherited by children classes

    public Animal(String color){ //to be used by children classes
        this.color = color;
    }

    public void sleep(){
        System.out.println("okay, I am sleeping now");
    }

    public abstract void eat(Food food);

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

enum Food{
    GRASS, MEAT, FRUIT, DRYFOOD
}
