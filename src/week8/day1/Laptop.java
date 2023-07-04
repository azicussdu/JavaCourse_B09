package week8.day1;

public class Laptop {
    String brand;
    String operatingSystem;
    double weight;
    int ram;

    public Laptop(String brand, String operatingSystem, double weight, int ram){
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.ram = ram;
    }

    public Laptop(){

    }

    public String toString(){
        return "brand: " + brand + "\nos: " + operatingSystem + "\n" +
                "weight: " + weight + "\nram: " + ram + "\n";
    }

}