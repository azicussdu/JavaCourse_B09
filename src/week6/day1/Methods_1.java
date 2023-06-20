package week6.day1;

import java.util.Random;
import java.util.Scanner;

public class Methods_1 {

    public static int findSumFromOneToFive(){
        int sum = 0;
        for(int i=1; i<=5; i++){
            sum = sum + i;
        }
        return sum;
    }

    //int from, int to -> are parameters of a method
    public static int findSumInRange(int from, int to){
        int sum = 0;
        for(int i=from; i<=to; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static double findMax(double a, double b, double c){
        double max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        return max;
    }

    // find the average of 3 INTEGERS!!!
    public static double findAverage(int a, int b, int c){
        return (a + b + c) / 3.0;
    }

    // method which finds if integer is an even number
    public static boolean isEven(int a){
        return a % 2 == 0;
    }

    // find if a String can be converted to integer
    // "12-54" false
    public static boolean isNumeric(String s){
        boolean canBeConverted = true;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) < 48 || s.charAt(i) > 57){
                canBeConverted = false;
                break;
            }
        }
        return canBeConverted;
    }


    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        String str = in.next();
//
//        if(isNumeric(str) == true){
//            int num = Integer.parseInt(str);
//            System.out.println(num + num);
//        }

//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//
//        boolean result = isEven(num);
//
//        System.out.println(result);

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        double average = findAverage(a, b, c);
//        System.out.println("average is: " + average);


//        Scanner in = new Scanner(System.in);
//        double a = in.nextDouble();
//        double b = in.nextDouble();
//        double c = in.nextDouble();
//
//        double maximum = findMax(a, b, c);
//        System.out.println("max is: " + maximum);



//        int num = findSumInRange(1, 10); //1+2+3....+10
//        System.out.println("sum is: " + num);

//        int y = findSumFromOneToFive();
//        System.out.println(y);

//        String s = "Hello";
//        int x = s.length();
//        System.out.println(x);

//        System.out.println("before calling a method");
//        findSumFromOneToFive(); //calling a method (using a method)
//        System.out.println("after calling a method");
    }
}
