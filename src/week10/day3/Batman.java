package week10.day3;

public class Batman extends Superhero implements IFlyable{
    public Batman(Universe universe) {
        super(universe);
    }

    @Override
    public void attack() {
        System.out.println("Batman attacking from the sky");
        System.out.println("Batman is beating someone");
    }

    @Override
    public void attackFromSky() {
        System.out.println("Batman attacking from the sky");
    }
}
