package week6.day2;

import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static double findAverage(int[] myarr){
        int sum = 0;
        for(int i=0; i<myarr.length; i++){
            sum = sum + myarr[i];
        }
        return (double)sum/myarr.length;
    }

    public static int findMaxIndex(double[] myarr){
        double max = myarr[0];
        int maxIndex = 0;

        for(int i=0; i<myarr.length; i++){
            if(myarr[i] >= max){
                max = myarr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void printOnlyFromEvenRows(int[][] myarr){
        for(int i=0; i< myarr.length; i++){
            for(int j=0; j<myarr[0].length; j++) {
                if(i % 2 == 0)
                    System.out.print(myarr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        // #1.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter array size: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextInt(1, 10);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        double result = findAverage(arr);
//        System.out.println("average is: " + result);

        // #2.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter array size: ");
//        int n = in.nextInt();
//
//        double[] arr = new double[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextDouble(1.0, 10.0);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        System.out.println("index of max is: " + findMaxIndex(arr));

        // #3.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter array size(N, M): ");
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int[][] arr = new int[n][m];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                arr[i][j] = random.nextInt(1, 21);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("and now, will print only values from even indexed rows");
//        printOnlyFromEvenRows(arr);

    }
}
