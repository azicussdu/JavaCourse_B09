package week7.day4;

public class Car {
    String model;
    String color;
    int year;
    boolean gas;

    /*
    Constructor - special method, which is called to create an object.
    1) constructor has the same name as a class name
    2) constructor has no return type(int or void and etc...)
    3) constructors are public
    4) constructor with no parameters - are default constructors
    5) If you don't have a constructor in you class then Java
        creates an invisible default constructor for you
    6) If you create a constructor in your class,
        then invisible default constructor is removed by Java
     */

    public Car(String mdl){
        model = mdl;
        year = 1886;
    }

    public Car(String mdl, String clr){
        model = mdl;
        color = clr;
        year = 1886;
    }

    public Car(String mdl, String clr, int y, boolean g){
        model = mdl;
        color = clr;
        year = y;
        gas = g;
    }

    public Car(){
        year = 1886;
    }

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