package week3.day4;

import java.util.Scanner;

public class JustAnotherLoop {
    public static void main(String[] args) {

        /*
        User enters as many numbers as he/she want. To finish entering numbers
        user must enter 0.
        Find sum of all numbers before 0.
         */

//        Scanner in = new Scanner(System.in);
//        System.out.println("enter any amount of numbers, just enter 0 to finish!");
//        int num, mult = 1;
//
//        while(true){            // 5 * 7 * 4    0
//            num = in.nextInt();
//            if(num == 0){
//                break;
//            }
//            mult = mult * num;
//        }
//
//        System.out.println("Multiplication is: " + mult);


        /*
        User enters as many numbers as he/she want. To finish entering numbers
        user must enter 0.
        Find amount of odds and evens before 0.
         */

//        Scanner in = new Scanner(System.in);
//        System.out.println("enter any amount of numbers, just enter 0 to finish!");
//        int num, countOdds = 0, countEvens = 0;
//
//        while(true){
//            num = in.nextInt();
//
//            if(num == 0)
//                break;
//
//            if(num % 2 == 0)
//                countEvens++;
//            else
//                countOdds++;
//        }
//
//        System.out.println("amount of odds is: " + countOdds);
//        System.out.println("amount of evens is: " + countEvens);

        //just one stupid example, no logic
        //just to show that break
        // can be used inside of any loop (while or for)
//        for(int i=10; i<=20; i++){
//            if(i == 15){
//                break;
//            }
//            System.out.println("i = " + i);
//        }


        /*
        Task: User enters a positive number(number is at least = 1).
        Find and print the amount of digits of that number.
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter a number: ");
//        long num = in.nextLong();
//        int count = 0;
//
//        while(true){
//            num = num / 10;
//            count++;
//
//            if(num == 0){
//                break;
//            }
//        }
//
//        System.out.println("The amount of digits: " + count);


        /*
        Task: User enters a positive number(number is at least = 1).
        Print the sum of digits.
        input: 35251
        output: 16    //because 3+5+2+5+1 = 16
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter a number: ");
//        long num = in.nextLong();
//        int sum = 0;
//
//        while(true){
//            sum = sum + (int)(num % 10);
//            num = num / 10;
//
//            if(num == 0){
//                break;
//            }
//        }
//
//        //2nd way (without while(true))
////        while(num != 0){
////            sum = sum + (int)(num % 10);
////            num = num / 10;
////        }
//
//        System.out.println("sum is: " + sum);

    }
}







