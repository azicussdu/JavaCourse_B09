package week2.day4;

import java.util.Scanner;

public class PracticeDataTypes {
    public static void main(String[] args) {

        //homework #2
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("please enter two-digit number: ");
//        int a = in.nextInt();
//
//        int b1 = a / 10;
//        int b2 = a % 10;
//
//        int result = b2 * 10 + b1;
//        System.out.println("The result is: " + result);


        // Homework #4
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("please enter two-digit number: ");
//        int a = in.nextInt();
//
//        int b1 = a / 10;
//        int b2 = a % 10;
//        int sum = b1 + b2;
//        boolean result = sum >= 10;
//
//        System.out.println("Condition sum of digits >= 10 is: " + result);

        //Homework #3
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("please enter a week day number: ");
//        int day = in.nextInt();
//
//        boolean isWeekDay = (day >= 1 && day <= 5);
//        System.out.println("The condition that day is weekday is: " + isWeekDay);

        /*
        Task: User inputs radius(double) of a sphere.
        Find the volume of sphere.
        V = 4/3 * pi * radius * radius * radius
         */
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter radius(double): ");
//        double radius = in.nextDouble();
//
//        double volume = 4.0 / 3.0 * 3.14 * radius * radius * radius;
//        System.out.println("The volume is: " + volume);

        /*
        User inputs a double number with 2 digits before and 2 digits after
        the point. (12.57)
        Print number before and number after the point.
        Output: before 12 and after 57
         */
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter double number like(12.34): ");
//        double num = in.nextDouble();
//
//        int a1 = (int) num;
//        int a2 = (int) ((num - a1) * 100);
//
//        System.out.println("first part is: " + a1);
//        System.out.println("second part is: " + a2);

        /*
        User inputs two-digit integer.
        Find if digits are equal to each other.
         */
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter two-digit number, pleeeaase: ");
//        int num = in.nextInt();
//
//        int d1 = num / 10;
//        int d2 = num % 10;
//
//        boolean isDigitsEqual = (d1 == d2);
//        System.out.println("Condition that digits are equal is: " + isDigitsEqual);

        /*
        User inputs 3-digit integer.
        Find if all digits are equal. (333 = true, 334 = false)
         */
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter three-digit number, pleeeaase: ");
//        int num = in.nextInt();
//
//        // 423
//        int d1 = num / 100;         // 423 / 100 = 4
//        int d2 = num / 10 % 10;     // 423 / 10 = 42 => 42 % 10 = 2
//        int d3 = num % 10;          // 423 % 10 = 3
//
//        boolean isAllDigitsEqual = (d1 == d2 && d2 == d3);
//        System.out.println("Condition all digits are equal is: " + isAllDigitsEqual);
//
//        // if at least 2 of digits are equal
//        // 343 = true, 556 = true, 444 = true, 345 = false
//        boolean isAtLeastTwoEqual = (d1 == d2 || d2 == d3 || d1 == d3);
//        System.out.println("Condition that at least 2 digits are equal is: " + isAtLeastTwoEqual);
//
//        //if all digits are different
//        //boolean isAllDifferent = (d1 != d2 && d2 != d3 && d1 != d3);
//        //System.out.println("Condition that all digits are different is: " + isAllDifferent);
//
//        //this is second way
//        boolean isAllDifferent2 = !isAtLeastTwoEqual;
//        System.out.println("Condition that all digits are different is: " + isAllDifferent2);
//
//        //print it vice versa (356 => 653)
//        int result = d3 * 100 + d2 * 10 + d1;
//        System.out.println("The result is: " + result);


        /*
        The worker should work for 8 hours.
        User inputs the time he spent in a work(in seconds)
        Print how many hours, minutes and seconds left to work
        1 hour = 60 minutes = 60 * 60 seconds = 3600 seconds

        Input: 7300
        Output: 5 hours 58 minutes and 20 seconds
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter seconds you spent in office: ");
        int spentSec = in.nextInt();

        int leftSec = 8 * 3600 - spentSec;
        System.out.println("left in seconds: " + leftSec);

        int hours = leftSec / 3600;
        System.out.println("Hours " + hours);

        //Finish it guys...
    }
}
