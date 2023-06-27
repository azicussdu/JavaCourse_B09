package week7.day1;

public class Car {
    String model;
    String color;
    int year;
    boolean gas;
    double milage;

    public void startEngine(){
        switch (model) {
            case "ferrari" -> System.out.println("ghor ghor");
            case "toyota" -> System.out.println("verr verr");
            case "porsche" -> System.out.println("dr dr dr dr");
            default -> System.out.println("brr brr");
        }
    }

    public void openWindows(){
        if(year < 1995)
            System.out.println("opening window manually");
        else
            System.out.println("opening window automatically");
    }
}
