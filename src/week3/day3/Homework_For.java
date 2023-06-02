package week3.day3;

import java.util.Scanner;

public class Homework_For {
    public static void main(String[] args) {

        // #1
        Scanner in = new Scanner(System.in);

        System.out.print("enter a number: ");
        int num = in.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            if(i % 2 == 0)
                sum = sum + i;
        }

        System.out.println("sum of even numbers: " + sum);

    }
}
