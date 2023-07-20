package week10.day3;

public class Groot extends Superhero{
    public Groot(Universe universe) {
        super(universe);
    }

    @Override
    public void attack() {
        System.out.println("Groot squeezing someone with trees");
        System.out.println("Groot is beating someone");
    }
}
