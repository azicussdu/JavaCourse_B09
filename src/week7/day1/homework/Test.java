package week7.day1.homework;

public class Test {
    public static void main(String[] args) {
        Laptop l1 = new Laptop(); //we are creating object of class Laptop
        l1.brand = "apple";
        l1.weight = 2.3;
        l1.ram = 8;

        l1.install("windows");
        System.out.println("The current os is: " + l1.operatingSystem);
    }
}
