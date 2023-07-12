package week9.day1.hometask;

public class Animal {
    private Size size;
    private String color;
    private boolean isHerbivorous;

    protected Animal(){}

    protected Animal(Size size, String color, boolean isHerbivorous) {
        this.size = size;
        this.color = color;
        this.isHerbivorous = isHerbivorous;
    }

    public String toString(){
        return "size=" + size +
                ", color='" + color + '\'' +
                ", isHerbivorous=" + isHerbivorous;
    }
}

enum Size{
    SMALL, MEDIUM, LARGE
}

