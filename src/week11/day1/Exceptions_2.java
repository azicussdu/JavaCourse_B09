package week11.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = 0, b = 0;
        try {
            System.out.print("enter A: ");
            a = in.nextInt();

            System.out.print("enter B: ");
            b = in.nextInt();

            System.out.println("the division of a and b is: " + (a / b));
            //throw new ArithmeticException("/ by zero");
        }
        catch (RuntimeException ex){ //catch(InputMismatchException | ArithmeticException ex){...}
            System.out.println("Please be careful with values");
        }

        System.out.println("a = " + a + ", b = " + b);

        System.out.println("The end of program, bye bye");

    }
}
