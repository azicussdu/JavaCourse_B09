package week10.day3;

public class Rocket extends Superhero implements IShootable{

    public Rocket(Universe universe) {
        super(universe);
    }

    @Override
    public void attack() {
        System.out.println("Rocket is shooting");
        System.out.println("Rocket is beating someone");
    }

    @Override
    public void attackWithShooting() {
        System.out.println("Rocket is shooting");
    }
}
