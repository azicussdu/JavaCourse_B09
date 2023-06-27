package week7.day1;

public class ClassesAndObjects_1 {
    public static void main(String[] args) {
        //creating an object of class Animal
        Animal a1 = new Animal();
        a1.type = "dog";
        a1.isHerbivorous = true;
        a1.color = "black";
        a1.age = 12;
        a1.size = "medium";

        a1.sleep();
        a1.wakeUp();

        a1.eat("meat");
        a1.speak();

//        Animal a2 = new Animal();
//        a2.type = "tiger";
//        a2.isHerbivorous = false;
//        a2.color = "yellow";
//        a2.size = "medium";
//        a2.age = 10;
//
//        a2.eat("meat");
//        a2.speak();

//        System.out.println("type of animal is: " + a1.type);
//        if(a1.isMammal)
//            System.out.println("this animal eats grass");
//        else
//            System.out.println("this animal eats meat");

        //----------------------------------------------------

//        Car c1 = new Car();
//        c1.gas = true;
//        c1.model = "ferrari";
//        c1.year = 1990;
//
//        c1.startEngine();
//        c1.openWindows();
    }
}
