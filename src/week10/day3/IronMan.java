package week10.day3;

public class IronMan extends Superhero implements IFlyable, IShootable{
    public IronMan(Universe universe) {
        super(universe);
    }

    @Override
    public void attack() {
        System.out.println("Ironman attacking from the sky");
        System.out.println("Ironman is shooting");
    }

    @Override
    public void attackFromSky() {
        System.out.println("Ironman attacking from the sky");
    }

    @Override
    public void attackWithShooting() {
        System.out.println("Ironman is shooting");
    }
}
