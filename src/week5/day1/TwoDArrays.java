package week5.day1;

import java.util.Random;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {

//        int[][] arr = {
//                {1,   2,   3,   4},
//                {10,  20,  31,  40},
//                {50,  95,  100, 120},
//                {200, 300, 400, 500}
//        };
//
//        for(int i=0; i<4; i++){
//            for(int j=0; j<4; j++){
//                if(arr[i][j] % 2 == 1)
//                    System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        /*
        change all values of array (by making it multiplied by 2)
         */
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter size(rows, columns): ");
//        int n = in.nextInt(); //n - size of rows
//        int m = in.nextInt(); //m - size of columns
//
//        int[][] arr = new int[n][m];
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                arr[i][j] = random.nextInt(1, 10);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++) {
//                arr[i][j] = 2 * arr[i][j];
//            }
//        }
//
//        System.out.println("after change: ");
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


        /*
        find minimum number of array
        also find the indexes of min number
         */
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter size(rows, columns): ");
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int[][] arr = new int[n][m];
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                arr[i][j] = random.nextInt(1, 101); //1-100
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int min = arr[0][0];
//        int rowInd = 0, colInd = 0;
//
//        for(int i=0; i<n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(arr[i][j] < min){
//                    min = arr[i][j];
//                    rowInd = i;
//                    colInd = j;
//                }
//            }
//        }
//
//        System.out.println("the minimum is: " + min);
//        System.out.println("the indexes are: [" + rowInd + "," + colInd + "]");

        /*
        Task: user inputs only N. You have array with size N*N.
        fill it with multiplication table, and show it.
         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        int[][] arr = new int[n][n];
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                arr[i][j] = (i+1) * (j+1);
//            }
//        }
//
//        for(int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        /*
        Task: input N and M as even numbers.
        If the sum of right half of array is greater than the left half sum -> "Right"
        If the sum of left half of array is greater than the right half sum -> "Left"
        If the sums are equal -> "Equal"
         */

//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter sizes(rows, columns, as even): ");
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int[][] arr = new int[n][m];
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                arr[i][j] = random.nextInt(1, 10); //1-9
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int leftSum = 0, rightSum = 0, midInd = m/2;
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++) {
//                if(j < midInd){
//                    leftSum = leftSum + arr[i][j];
//                }
//                else{
//                    rightSum = rightSum + arr[i][j];
//                }
//            }
//        }
//
//        if(leftSum > rightSum)
//            System.out.println("Left");
//        else
//            if(rightSum > leftSum)
//                System.out.println("Right");
//            else
//                System.out.println("Equal Left and Right");
//
//        int topSum = 0, bottomSum = 0, midInd2 = n/2;
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++) {
//                if(i < midInd2){
//                    topSum = topSum + arr[i][j];
//                }
//                else{
//                    bottomSum = bottomSum + arr[i][j];
//                }
//            }
//        }
//
//        if(topSum > bottomSum)
//            System.out.println("Top");
//        else
//            if(bottomSum > topSum)
//                System.out.println("Bottom");
//            else
//                System.out.println("Equal Top and Bottom");


    }
}








