package week8.day3;

public class Laptop {
    private String brand;
    private String operatingSystem = "";
    private double weight;
    private int ram;

    public Laptop(String brand, String operatingSystem, double weight, int ram){
        setBrand(brand);
        setOperatingSystem(operatingSystem);
        setWeight(weight);
        setRam(ram);
    }

    public Laptop(){}

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem(){
        return operatingSystem;
    }

    public void setWeight(double weight){
        if(weight < 0)
            this.weight = weight * -1;
        else
            this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setRam(int ram){
        if(ram < 0)
            this.ram = ram * -1;
        else
            this.ram = ram;
    }

    public int getRam(){
        return ram;
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

    public String toString(){
        return "brand: " + brand + ", os: " + operatingSystem + ", weight: " + weight + ", ram: " + ram;
    }
}
