package week10.day3;

public abstract class Superhero {
    private Universe universe;

    public Superhero(Universe universe) {
        this.universe = universe;
    }

    public abstract void attack();
}

enum Universe {
    DC, MARVEL
}
