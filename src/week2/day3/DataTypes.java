package week2.day3;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args){

        // byte, short, int, long data types
//        Scanner in = new Scanner(System.in);
//        System.out.print("please enter your age: ");
//        byte age = in.nextByte(); //should call nextByte() not nextInt()
//        System.out.println("You age is: " + age);

        //float vs double
//        Scanner in = new Scanner(System.in);
//        float a = 10.3f; //should add f after value for float
//        float b = 3; //here no need to add f, if the value is given without point
//
//        float c = a + b;
//        System.out.println("Value of c is: " + c);

        // inputing double values from keyboard
//        Scanner in = new Scanner(System.in);
//
//        double a = 3.5;
//        double b = 5; //you can save like this, it will be 5.0 after saving to b
//        //but not vice versa: int b = 3.5;
//        double c = in.nextDouble(); // type with comma (3,3 not 3.3)
//
//        System.out.println(a + b + c);


        // you should know about division
//        System.out.println(5 / 2); // division of int to int = so result is int (=2)
//        System.out.println(5 / 2.0);  // if at least one of the values double = so result is double

//        int a = 5;
//        int b = 2;
//
//        // I am not changing the value a variable, but only the number 5 to 5.0
//        System.out.println( (double)a / b ); //explicit type casting

        // TASK: User inputs 3 integers. Find average of three numbers.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter first number: ");
//        int a = in.nextInt();
//        System.out.print("enter second number: ");
//        int b = in.nextInt();
//        System.out.print("enter third number: ");
//        int c = in.nextInt();
//
//        double avg = (double)(a+b+c) / 3; //a=3  b=4  c=4
//        System.out.println("The average is: " + avg);

        //TASK: User inputs two-digit integer. Find the sum of digits.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter two-digit number: ");
//        int a = in.nextInt();
//
//        int d1 = a/10;
//        int d2 = a%10;
//
//        System.out.println("d1 = " + d1);
//        System.out.println("d2 = " + d2);
//
//        System.out.println("Sum of d1 and d2 = " + (d1 + d2));

        // byte, short, int, long
        // float double
        // char
        // boolean

        // we will learn chars when we have Strings topic
//        char a = '7';
//        System.out.println("value of char a = " + a);

//        boolean a = true;
//        System.out.println("the value of a is: " + a);

        // one example
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter the value of a: ");
//        int a = in.nextInt();
//        System.out.print("enter the value of b: ");
//        int b = in.nextInt();
//
//        boolean c = a > b;
//        System.out.println("The condition a > b is: " + c);

        // User input 1 integer. Check the condition that number is odd.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter value of a: ");
//        int a = in.nextInt();
//
//        boolean result = a % 2 == 1;
//        System.out.println("Condition that a is odd is: " + result);

        // User input 1 integer. Check the condition that number is positive.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter value of a: ");
//        int a = in.nextInt();
//
//        boolean result = a > 0;
//        System.out.println("Condition that a is positive is: " + result);

        // User inputs a number. Find if it is two-digit.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter value of a: ");
//        int a = in.nextInt();
//
//        boolean result = (a >= 10 && a <= 99);
//        System.out.println("Condition a is two-digit number is: " + result);

        //user inputs finger number, find if it is a thumb?
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter value of a: ");
//        int a = in.nextInt();
//
//        boolean result = (a == 5 || a == 6);
//        System.out.println("Condition that a is a thumb number is: " + result);

        //User inputs 2 number. Find if both of them are odd numbers.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter value of a: ");
//        int a = in.nextInt();
//        System.out.print("enter value of b: ");
//        int b = in.nextInt();
//
//        boolean result = (a%2 == 1 && b%2 == 1);
//        System.out.println("Condition that both are odd is: " + result);

        //User inputs 2 number. Find if only one number is odd.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter value of a: ");
//        int a = in.nextInt();
//        System.out.print("enter value of b: ");
//        int b = in.nextInt();
//
//        //boolean result = (a%2 == 1 && b%2 == 0) || (a%2 == 0 && b%2 == 1);
//        boolean result = (a%2 != b%2);
//        System.out.println("Condition that only 1 number is odd is: " + result);

    }
}
