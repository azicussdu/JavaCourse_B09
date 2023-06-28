package week7.day1;

public class Animal {
    //properties here
    String type;
    boolean isHerbivorous;
    int age;
    String size; //small, medium, large, giant
    String color; //white, black, ...
    boolean isSleeping;


    //behaviours here
    public void eat(String food){ //grass or meat
        if(!isSleeping){
            if(isHerbivorous && food.equals("grass") || !isHerbivorous && food.equals("meat"))
                System.out.println("The " + type + " is eating now");
            else
                System.out.println("Hey, I do not eat it, sorry!");
        }
    }

    public void speak(){ //dog, cat, tiger, bird
        if(!isSleeping){
            switch (type) {
                case "dog" -> System.out.println("woof woof");
                case "cat" -> System.out.println("meaw meaw");
                case "tiger" -> System.out.println("rrrr");
                case "bird" -> System.out.println("tchiw tchiw");
            }
        }
//        if(type.equals("dog")){ //if(type == "dog")
//            System.out.println("woof woof");
//        }
//        else
//            if(type.equals("cat")){
//
//            }
    }

    public void sleep(){
        isSleeping = true;
    }

    public void wakeUp(){
        isSleeping = false;
    }

}
