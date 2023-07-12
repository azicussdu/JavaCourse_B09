package week9.day1.hometask;

public class Dog extends Animal {
    private Breed breed;
    private String dogName;

    public Dog(Size size, String color, boolean isHerbivorous, Breed breed, String dogName) {
        super(size, color, isHerbivorous);
        this.breed = breed;
        this.dogName = dogName;
    }

    public String toString() {
        return "breed=" + breed +
                ", dogName='" + dogName + '\'' +
                ", " + super.toString();
    }
}

enum Breed {
    LABRADOR, GERMAN_SHEPHERD, BULLDOG, HUSKY, CHIHUAHUA
}
