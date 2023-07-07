package week8.day3;

public class TestLaptop {
    public static void main(String[] args) {

        Laptop l1 = new Laptop("Asus", "windows", -3.5, -8);
        System.out.println(l1);

//        l1.weight = 3.3; //here I am setting a value
//        System.out.println("weight: " + l1.weight); //here I am getting the value

        l1.setWeight(3.3);
        System.out.println(l1.getWeight());


    }
}
