package week7.day4;

public class Laptop {
    String brand;
    String operatingSystem;
    double weight;
    int ram;

    public Laptop(String brand){
        this.brand = brand;
        weight = 2.0;
        ram = 4;
    }

    public Laptop(String brand, String operatingSystem, double weight, int ram){
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.ram = ram;
    }

    public Laptop(String brand, String operatingSystem){
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        weight = 2.0;
        ram = 4;
    }

    public void install(String os){
        if(operatingSystem.equals(os))
            System.out.println("the os " + os + " is already installed");
        else
        if(os.equals("macos") && !brand.equals("apple"))
            System.out.println("macos can be installed only to apple brand");
        else
        if(os.equals("windows") && ram < 8)
            System.out.println("sorry, ram should be 8 gb minimum to install windows");
        else {
            operatingSystem = os; // we are installing new operating system
            System.out.println("os " + os + " is installed successfully");
        }
    }

    public void turnOn(){
        switch (operatingSystem) {
            case "windows" -> System.out.println("windows turning on sound");
            case "linux" -> System.out.println("linux turning on sound");
            case "macos" -> System.out.println("macos turning on sound");
        }
    }

    public void turnOff(){
        switch (operatingSystem) {
            case "windows" -> System.out.println("windows turning off sound");
            case "linux" -> System.out.println("linux turning off sound");
            case "macos" -> System.out.println("macos turning off sound");
        }
    }

    public void printProperties(){
        System.out.println("brand: " + brand);
        System.out.println("operating system: " + operatingSystem);
        System.out.println("weight: " + weight + " kg");
        System.out.println("ram: " + ram + " gb");
    }
}