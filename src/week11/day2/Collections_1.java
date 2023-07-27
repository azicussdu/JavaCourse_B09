package week11.day2;

import week10.day2.ex2.*;
import week11.day1.hometask.Printer;

import java.util.*;

public class Collections_1 {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Salah");
//        list.add("Outmane");
//        list.add("Cavour");
//        list.add("Salah");
//        list.add("Salah");
//        list.add("Salah");
//
//        for(String name : list){
//            System.out.println(name);
//        }

//        Set<Integer> set = new TreeSet<Integer>();
//        set.add(54);
//        set.add(23);
//        set.add(12);
//        set.add(76);
//        set.add(27);
//
//        for(Integer number : set){
//            System.out.print(number + "-");
//        }

        //1. sets unique values
        //2. sets don't maintain the insertion order

        Set<String> set = new HashSet<String>();
        set.add("Salah");
        set.add("Outmane");
        set.add("Cavour");
        set.add("Kamarya");
        set.add("Deniz");
        set.add("SaLaH");

        for(String name : set){
            System.out.println(name);
        }



        //List, Set

//        List<String> list = new ArrayList<>();
//        //ArrayList adding to the end, removing from end is faster
//
//        list = new LinkedList<>();
//        //adding and removing from the beginning or in the middle is faster

//        ------------------------------------------

//        IMessenger messenger = new Whatsapp(12);
//        messenger.sendMessage("12222", "my message");
//        //you wrote with whatsapp
//
//        messenger = new Telegram(24);
//        messenger.sendMessage("12222", "my message");
//        //you wrote with telegram
//
//        messenger = new Wechat(36);
//        messenger.sendMessage("12222", "my message");
//        //you wrote with wechat

//        --------------------------------------------

//        int[] arr = {1, 2, 3};
//        ArrayList<Integer> list = new ArrayList<>();

        /*
        1. ArrayList stores only Object types (not primitive)
        But array can work with both

        2. Array is a fixed size
        But ArrayList size grows as you add values

        3. ArrayList has many useful methods
         */

    }
}
