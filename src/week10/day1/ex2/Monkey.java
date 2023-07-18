package week10.day1.ex2;

public class Monkey extends Animal{
    private boolean canJump;

    public Monkey(String color, boolean canJump) {
        super(color);
        this.canJump = canJump;
    }

    @Override
    public void eat(Food food) {
        if(food == Food.FRUIT || food == Food.GRASS)
            System.out.println("Okay I am eating");
    }
}
