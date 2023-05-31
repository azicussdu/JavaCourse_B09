package week3.day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {

        //Switch statement

        /*
        Task: User enters month number(1-12). Print the season of this month.
        input: 2
        output: Winter
        ------------
        input: 14
        output: Wrong input
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter month number: ");
//        int month = in.nextInt();
//
//        switch(month){
//            case 1: case 2: case 12:
//                System.out.println("Winter"); break;
//            case 3: case 4: case 5:
//                System.out.println("Spring"); break;
//            case 6: case 7: case 8:
//                System.out.println("Summer"); break;
//            case 9: case 10: case 11:
//                System.out.println("Autumn"); break;
//            default:
//                System.out.println("Wrong input");
//        }

//        switch (month) {
//            case 1, 2, 12 -> System.out.println("Winter");
//            case 3, 4, 5 -> System.out.println("Spring");
//            case 6, 7, 8 -> System.out.println("Summer");
//            case 9, 10, 11 -> System.out.println("Autumn");
//            default -> System.out.println("Wrong input");
//        }

        /*
        Task: User enters one number(finger number).
        Print the name of a finger.
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter finger number: ");
//
//        int fn = in.nextInt();
//
//        switch(fn){
//            case 1,10 -> System.out.println("Little finger");
//            case 2,9 -> System.out.println("Ring finger");
//            case 3,8 -> System.out.println("Middle finger");
//            case 4,7 -> System.out.println("Index finger");
//            case 5,6 -> System.out.println("Thumb finger");
//            default -> System.out.println("Wrong input");
//        }

        /*
        Task: You enter 1 number.
        If it is even you make it 2 times bigger.
        If it is odd you make it 3 times bigger.
         */

//        int num = 11;
//
//        if(num % 2 == 0)
//            num = num * 2;
//        else
//            num = num * 3;
//
//        System.out.println("Now number is: " + num);

        // using ternary operator (not if-else)
//        num = num % 2 == 0 ? num * 2 : num * 3;
//        System.out.println("Now number is: " + num);

    }
}








