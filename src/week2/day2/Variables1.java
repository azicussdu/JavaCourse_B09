package week2.day2;

import java.util.Scanner;

public class Variables1 {
    public static void main(String[] args){

        /*
            if you want to disable some code (so it won't be executed when you run your program)
            you should comment you code.
            Just highlight all line you want to comment and press
            ctrl + \ in windows OR
            ⌘ / in macOS
            after you can highlight again and uncomment using same keys
         */

//        int age = 25; // creating a variable age(with type integer) with value 25
//        System.out.println(age); // prints 25
//
//        age = 26; // also you can change the value of a variable
//        System.out.println(age); //prints 26


//        int age; // you can create a variable but without a value (without initialization)
//        age = 22; // then after you can give a value
//
//        System.out.println("My age is: " + age); //prints: My age is: 22
//        System.out.println("After ten years I will be " + (age+10)); // age+10 = 22+10 = 32


//        int d1Age = 5; // age of first daughter
//        int d2Age = 3; // age of second daughter
//        System.out.println("Sum of their ages = " + (d1Age + d2Age));


        // name of variables can include: letters, digits and underscore '_'
        // you can not start the name with digits
//        int myAge; //camelCase convention (first word starts with lowercase, others with Uppercase)
//        int hisAge_01; // it is ok
//        int _balance; // it is also ok
//        int 4_age; // it gives error (can not start name with digits)


//        int a = 2;
//        int b = 5;
//        int age2 = a + b; // you can give value with formula(2+5 or a+b)
//        System.out.println(age2);


//        #2. Perimeter and Area of Square
//        int sideLength = 10;
//        int perimeter = sideLength * 4;
//        int area = sideLength * sideLength;
//        System.out.println("Perimeter is: " + perimeter);
//        System.out.println("Area is: " + area);

//        #3. Perimeter and Area of Rectangle
//        int length = 8, width = 4; // 24
//        int perimeter = (length + width) * 2;
//        int area = length * width;
//        System.out.println("Perimeter is: " + perimeter);
//        System.out.println("Area is: " + area);

        /*
        using Scanner class to enter values from console(keyboard)
        System.in = console(or keyboard)
         */

//        #3. Perimeter and Area of Rectangle
//        Scanner in = new Scanner(System.in); // creating object of Scanner class (to use it later)
//
//        System.out.print("enter first number: ");
//        int length = in.nextInt(); // in.nextInt() = reading from console(keyboard)
//        System.out.print("enter second number: ");
//        int width = in.nextInt(); // reading second input from console
//
//        int perimeter = (length + width) * 2;
//        int area = length * width;
//
//        System.out.println("Perimeter is: " + perimeter);
//        System.out.println("Area is: " + area);

        //#4. Convert into days
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter amount of weeks: ");
//        int weeks = in.nextInt();
//
//        System.out.print("enter amount of days: ");
//        int days = in.nextInt();
//
//        int totalDays = weeks * 7 + days;
//        System.out.println("Total days: " + totalDays);
    }
}










