package week6.day2;

import java.util.Random;
import java.util.Scanner;

public class Methods_2 {

    public static int findSumOfArray(int[] myarr){
        int sum = 0;
        for(int i=0; i<myarr.length; i++){
            sum = sum + myarr[i];
        }
        return sum;
    }

    public static void printArray(int[] myarr){
        System.out.println("---------- printing values -----------");
        for(int i=0; i<myarr.length; i++){
            System.out.print(myarr[i] + " ");
        }
        System.out.println("\n--------------------------------------");
    }

    public static void fillArray(int[] myarr, int f, int t){
        Random random = new Random();
        for(int i=0; i<myarr.length; i++){
            myarr[i] = random.nextInt(f, t);
        }
    }

    public static int findMax(int[] myarr){
        int max = myarr[0];
        for(int i=0; i< myarr.length; i++){
            if(myarr[i] > max)
                max = myarr[i];
        }
        return max;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter array size: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.print("enter range values(from to): ");
//        int from = in.nextInt();
//        int to = in.nextInt();
//
//        fillArray(arr, from, to);
//        printArray(arr);
//
//        int sum = findSumOfArray(arr);
//        System.out.println("sum of all elements inside array is: " + sum);

        /*
        find the max number from array
         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter array size: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        fillArray(arr, 1, 101);
//        printArray(arr);
//
//        int result = findMax(arr);
//        System.out.println("the max number is: " + result);

    }
}
