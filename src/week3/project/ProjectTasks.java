package week3.project;

import java.util.Scanner;

public class ProjectTasks {
    public static void main(String[] args) {

        // #1. Find max among 3 positive integers. (simplest solution is given)
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter 3 integers: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int max = 0;
//
//        if(a > max)
//            max = a;
//        if(b > max)
//            max = b;
//        if(c > max)
//            max = c;
//
//        System.out.println("Maximum number is: " + max);

        // #2. Find if number is positive, negative or zero.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter one number: ");
//        int num = in.nextInt();
//
//        if(num > 0){
//            System.out.println("entered number is positive");
//        }
//        else
//            if(num < 0){
//                System.out.println("entered number is negative");
//            }
//            else {
//                System.out.println("entered number is zero");
//            }

        // #3. Print the amount of days of given month.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter month number: ");
//        int month = in.nextInt();
//
//        switch (month){
//            case 1,3,5,7,8,10,12 -> System.out.println("Amount of days: 31");
//            case 4,6,9,11 -> System.out.println("Amount of days: 30");
//            case 2 -> System.out.println("Amount of days: 28");
//            default -> System.out.println("Wrong input");
//        }

        // #4. Numbers that are divisible by 3 or 5.
//        for(int i=1; i<=30; i++){
//            if(i % 3 == 0 || i % 5 == 0)
//                System.out.print(i + " ");
//        }

        // #5. Print numbers in the range from N to 2*N.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter a number: ");
//        int num = in.nextInt();
//
//        for(int i=num; i<=2*num; i++){
//            if(i % 2 == 1)
//                System.out.print(i + " ");
//        }

        // #6. Print numbers between A and B in ascending order.
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter two numbers: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int min, max;
//
//        if(a > b){
//            max = a;
//            min = b;
//        }
//        else{
//            max = b;
//            min = a;
//        }
//
//        for(int i=min; i<=max; i++){ //so we start from min number and go to max one
//            System.out.print(i + " ");
//        }

        // #7. Sum of positive numbers.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter 7 numbers: ");
//        int num, sum = 0;
//
//        for(int i=1; i<=7; i++){
//            num = in.nextInt();
//            if(num > 0){
//                sum = sum + num;
//            }
//        }
//
//        System.out.println("sum is: " + sum);

        // #8. Find minimum of negative numbers.
//        Scanner in = new Scanner(System.in);
//        //we will assign 0, so after first comparison
//        //the value of min will be definitely changed
//        int num, min = 0;
//        int amount = in.nextInt();
//
//        for(int i=1; i<=amount; i++){
//            num = in.nextInt();
//            if(num < min){
//                min = num;
//            }
//        }
//
//        System.out.println("minimum is: " + min);

        // #9. Amount of numbers where sum of digits is less than
//        int count = 0;
//        int d1, d2, d3;
//        for(int i=100; i<=999; i++){
//            d1 = i / 100;
//            d2 = i / 10 % 10;
//            d3 = i % 10;
//
//            if((d1 + d2 + d3) < 7){
//                count++;
//            }
//        }
//
//        System.out.println(count);

        // #10. User enters numbers, while the sum <= 20
//        Scanner in = new Scanner(System.in);
//        int num, sum = 0;
//
//        System.out.println("enter numbers: ");
//        while(true){
//            num = in.nextInt();
//            sum = sum + num;
//
//            if(sum > 20)
//                break;
//        }
//
//        System.out.println("sum is: " + sum);
    }
}
