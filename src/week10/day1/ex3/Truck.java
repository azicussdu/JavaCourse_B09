package week10.day1.ex3;

public class Truck extends Vehicle{
    private double maxWeight;

    public Truck(String color, int year, boolean gas, double maxWeight) {
        super(color, year, gas);
        this.maxWeight = maxWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
