package week8.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestLaptop {
    public static void main(String[] args) {

//        Laptop l1 = new Laptop("Acer", "windows", 3.6, 8);
//
//        //System.out.println(l1.toString());
//        System.out.println(l1);

//        Laptop l1 = new Laptop("HP", "windows", 3.4, 8);
//        Laptop l2 = new Laptop("Acer", "linux", 3.1, 16);
//        Laptop l3 = new Laptop("Macbook", "macos", 2.4, 32);
//
//        Laptop[] arr = {l1, l2, l3};
//
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

//        Laptop l1 = new Laptop("HP", "windows", 3.4, 8);
//        Laptop l2 = new Laptop("Acer", "linux", 3.1, 16);
//        Laptop l3 = new Laptop("Macbook", "macos", 2.4, 32);
//
//        ArrayList<Laptop> list = new ArrayList<Laptop>(List.of(l1, l2, l3));
//
//        Laptop l4 = new Laptop("Samsung", "linux", 2.4, 32);
//        list.add(l4);
//
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

        Scanner in = new Scanner(System.in);
        ArrayList<Laptop> list = new ArrayList<>();

        while(true){
            System.out.println("press 1 to see all laptops");
            System.out.println("press 2 to add a new laptop");
            System.out.println("press 3 to remove laptop");
            System.out.println("press 4 exit the menu");

            int num = in.nextInt();

            if(num == 1){
                if(list.size() == 0)
                    System.out.println("sorry, no laptops available");
                else{
                    for(int i=0; i<list.size(); i++)
                        System.out.println(list.get(i));
                }
            }
            else
                if(num == 2){
                    Laptop ltp = new Laptop();
                    System.out.print("enter the brand: ");
                    ltp.brand = in.next();
                    System.out.print("enter the os: ");
                    ltp.operatingSystem = in.next();
                    System.out.print("enter the weight: ");
                    ltp.weight = in.nextDouble();
                    System.out.print("enter the ram: ");
                    ltp.ram = in.nextInt();

                    list.add(ltp);
                }
                else
                    if(num == 3){
                        for(int i=0; i<list.size(); i++){
                            System.out.println((i+1) + ". " + list.get(i).brand + " - " + list.get(i).operatingSystem);
                        }
                        System.out.print("enter number to remove: ");
                        int n = in.nextInt();

                        list.remove(n-1);
                    }
                    else
                        if(num == 4){
                            System.out.println("bye bye, see u!");
                            break;
                        }

        }


    }
}









