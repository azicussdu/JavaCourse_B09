package week10.day1.ex3;

public class Car extends Vehicle{
    private String brand;

    public Car(String color, int year, boolean gas, String brand) {
        super(color, year, gas);
        this.brand = brand;
    }

    public Car(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
