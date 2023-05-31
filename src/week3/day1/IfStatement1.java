package week3.day1;

import java.util.Scanner;

public class IfStatement1 {
    public static void main(String[] args) {

         /*
         Task: If user entered odd number, then make this number twice bigger
         and print it
         otherwise(if it is even), then make this number three times bigger
         also print it
          */

//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//
//        if(num % 2 == 1){
//            num = num * 2;
//            System.out.println("Now number value = " + num);
//        }
//        else{
//            num = num * 3;
//            System.out.println("Now number value = " + num);
//        }


        /*
        User enters two numbers, find minimum one and print it.
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter 1st number: ");
//        int a = in.nextInt();
//
//        System.out.print("enter 2nd number: ");
//        int b = in.nextInt();
//
//        if(a <= b){
//            System.out.println("minimum is: " + a);
//        }
//        else{
//            System.out.println("minimum is: " + b);
//        }

        /*
        Task: User enters one number. Print "Yes" if the number is
        two-digit number, and "No" otherwise.
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//
//        if(num > 9 && num < 100){
//            System.out.println("Yes, two-digit number");
//        }
//        else {
//            System.out.println("No");
//        }

        /*
        Task: User enters 3 numbers. Print the amount of odd and even numbers.
        input: 3  6  8
        output:
            odds: 1
            evens: 2
         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter 3 numbers: ");
//
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int odds = 0, evens = 0;
//
//        if(a % 2 == 1){
//            odds = odds + 1;
//        }
//        else {
//            evens = evens + 1;
//        }
//
//        if(b % 2 == 1)
//            odds = odds + 1;
//        else
//            evens = evens + 1;
//
//        if(c % 2 == 1)
//            odds = odds + 1;
//        else
//            evens = evens + 1;
//
//        System.out.println("Odds: " + odds);
//        System.out.println("Evens: " + evens);


         /*
         Task: You are given one number(year). Print "Leap" if the entered
         year is a leap one, and print "Not leap" otherwise.

         It is a leap year if one of two conditions is true:
            1) if a year is divisible by 4 and not divisible by 100
            2) if a year is divisible by 400
          */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a year number: ");
//        int year = in.nextInt();
//
//        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//            System.out.println("It is a leap year!");
//        }
//        else{
//            System.out.println("It is not a leap year!");
//        }

        /*
        User enters 1 number(1-9999): Print how many digits this number has.
        input: 567
        output: it has 3 digits
        -------------
        input: 34456
        output: wrong input
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter number between 1-9999: ");
//        int num = in.nextInt(); //num = 77
//
//        // IF-ELSE-IF statement (nested if-else)
//        if(num > 0 && num < 10)
//            System.out.println("1 digit number");
//        else
//            if(num >= 10 && num <= 99)
//                System.out.println("2 digit number");
//            else
//                if(num >= 100 && num <= 999)
//                    System.out.println("3 digit number");
//                else
//                    if(num >= 1000 && num <= 9999)
//                        System.out.println("4 digit number");
//                    else
//                        System.out.println("Wrong input");


        /*
        User inputs a number, find if its:
        - divisible by only 2
        - divisible by only 3
        - divisible by 2 and 3 at same time (div by 6)
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter 1 number: ");
//        int num = in.nextInt(); //num = 5
//
//        if(num % 6 == 0)
//            System.out.println("divisible only by 6");
//        else
//            if(num % 3 == 0)
//                System.out.println("divisible only by 3");
//            else
//                if(num % 2 == 0)
//                    System.out.println("divisible only by 2");
//                else
//                    System.out.println("not divisible by any of 2, 3, or 6");

        /*
        Task: user enters price of a product.
        if the price is >=1000 then it has 5% discount
        if the price is >=5000 then it has 10% discount
        if the price is >=10000 then it has 20% discount
        print the final price to pay for the user
        input: 2000
        output: pay 1900
        ----------------
        input: 6000
        output: 5400
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter the price: ");
//        int price = in.nextInt(); //price = 1111
//        double finalPrice;
//
//        if(price >= 10000){
//            finalPrice = price - (price * 20 / 100.0);
//        }
//        else
//            if(price >= 5000){
//                finalPrice = price - (price * 10 / 100.0);
//            }
//            else
//                if(price >= 1000){
//                    finalPrice = price - (price * 5 / 100.0);
//                }
//                else{
//                    finalPrice = price;
//                }
//
//        System.out.println("The final price is: " + finalPrice);
    }
}







