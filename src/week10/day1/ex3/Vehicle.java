package week10.day1.ex3;

public class Vehicle {
    private String color; //default = package-private
    private int year;
    private boolean gas;

    public Vehicle(){}

    public Vehicle(String color, int year, boolean gas) {
        this.color = color;
        this.year = year;
        this.gas = gas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }
}
