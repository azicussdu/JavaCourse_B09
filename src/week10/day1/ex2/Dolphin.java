package week10.day1.ex2;

public class Dolphin extends Animal{

    private boolean isWild;

    public Dolphin(String color, boolean isWild) {
        super(color);
        this.isWild = isWild;
    }

    @Override
    public void sleep(){
        System.out.println("sorry, Outmane said I never sleep!, soo...");
    }

    @Override
    public void eat(Food food) {
        if(food == Food.MEAT)
            System.out.println("Okay I am eating");
    }
}
