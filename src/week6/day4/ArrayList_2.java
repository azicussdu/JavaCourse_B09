package week6.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayList_2 {
    public static void main(String[] args) {

        /*
        in arraylist, change all even values to value*2,
                      change all odd  values to value*3
         */
//        Random random = new Random();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<5; i++){
//            list.add(random.nextInt(1, 11));
//            // arr[i] = random.nextInt(1, 11);
//        }
//        System.out.println("before: " + list);
//
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i) % 2 == 0)  //if(arr[i] % 2 == 0)
//                list.set(i, list.get(i) * 2);
//            else
//                list.set(i, list.get(i) * 3);
//        }
//
//        System.out.println("after: " + list);

        /*
        Arraylist of numbers. change all negative values to 0
         */
//        Random random = new Random();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<10; i++){
//            list.add(random.nextInt(-2, 11));
//        }
//        System.out.println("before: " + list);
//
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i) < 0){
//                list.set(i, 0);
//            }
//        }
//
//        System.out.println("after: " + list);

        /*
        Arraylist of numbers. change all negative values to its positive values
         */
//        Random random = new Random();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<10; i++){
//            list.add(random.nextInt(-5, 11));
//        }
//        System.out.println("before: " + list);
//
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i) < 0){
//                list.set(i, list.get(i) * -1);
//            }
//        }
//
//        System.out.println("after: " + list);


        /*
        add value 100, right after the first value of arraylist
        add value 200, right before the last element
        add value 300, to the middle
         */
//        Random random = new Random();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<10; i++){
//            list.add(random.nextInt(1, 11));
//        }
//        System.out.println("before: " + list);
//
//        list.add(1, 100);
//        list.add(list.size()-1, 200);
//        list.add(list.size()/2, 300);
//
//        System.out.println("after: " + list);


        /*
        add value 100 after a given value
         */
//        Random random = new Random();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<10; i++){
//            list.add(random.nextInt(1, 101));
//        }
//        System.out.println("before: " + list);
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter value from the list: ");
//        int value = in.nextInt();
//
//        int index = list.indexOf(value);
//        list.add(index+1, 100);
//
//        System.out.println("after: " + list);




//        int[] arr = new int[10];
//        ArrayList<Integer> list = new ArrayList<>();

//        int[] arr2 = {1, 2, 3};
//        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1, 2, 3));
//        System.out.println(list);

//        ArrayList<String> list2 = new ArrayList<String>(List.of("one", "two", "three"));


        /*
            You have arraylist with sorted values inside,
            you are given a number
            find where to add given number in the arraylist

            1, 5, 8, 14, 18, 20, 25
            value = 16
            1, 5, 8, 14, 16, 18, 20, 25
         */

//        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1, 4, 8, 14, 17, 25, 30, 37));
//        System.out.println("before: " + list);
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter value: ");
//        int value = in.nextInt();
//
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i) > value){
//                list.add(i, value);
//                break;
//            }
//        }
//
//        System.out.println("after: " + list);


//        ArrayList<String> list = new ArrayList<String>(List.of("one", "two", "three", "four"));
//        System.out.println("before: " + list);

//        list.remove(1);
//        list.remove("four");
//
//        System.out.println("after: " + list);


//        ArrayList<Integer> list = new ArrayList<Integer>(List.of(10, 20, 30, 40, 50));
//        System.out.println("before: " + list);
//
////        Integer value = 20;
//        int v = 20;
//        list.remove(Integer.valueOf(v)); //int -> Integer
//
//        System.out.println("after: " + list);

        /*
        you have arraylist with random numbers,
        remove the first maximum element from the arraylist
         */

//        ArrayList<Integer> list = new ArrayList<>();
//
//        Random random = new Random();
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("how many numbers you want: ");
//        int n = in.nextInt();
//
//        for(int i=0; i<n; i++){
//            list.add(random.nextInt(1, 11));
//        }
//        System.out.println("before: " + list);
//
//        Integer max = list.get(0);
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i) > max){
//                max = list.get(i);
//            }
//        }
//        list.remove(max);
//
//        System.out.println("after: " + list);

        /*
        the same task, but remove the last maximum number
         */

        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("how many numbers you want: ");
        int n = in.nextInt();

        for(int i=0; i<n; i++){
            list.add(random.nextInt(1, 11));
        }
        System.out.println("before: " + list);

        Integer max = list.get(0);
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        int lastIndex = list.lastIndexOf(max);
        list.remove(lastIndex);

        System.out.println("after: " + list);



    }
}







