package week10.day3;

public class Superman extends Superhero implements IFlyable, IShootable{

    public Superman(Universe universe) {
        super(universe);
    }

    @Override
    public void attack() {
        System.out.println("Superman attacking from the sky");
        System.out.println("Superman is shooting");
    }

    @Override
    public void attackFromSky() {
        System.out.println("Superman attacking from the sky");
    }

    @Override
    public void attackWithShooting() {
        System.out.println("Superman is shooting");
    }
}
