package week4.day4;

import java.util.Scanner;

public class NestedLoops_2 {
    public static void main(String[] args) {

//        for(int i=1; i<=3; i++){ //is for row numbers
//            for(int j=1; j<=5; j++){ // is for column numbers
//                System.out.print("[i:" + i + ",j:" + j + "]  ");
//            }
//            System.out.println();
//        }

            /*
            Task: User enters N(size of square). Just draw picture below.
            input: 5
            output:
            * * * * *
            * *   * *
            *   *   *
            * *   * *
            * * * * *
             */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i==1 || j==1 || i==n || j==n || i==j || i+j==n+1)
//                    System.out.print(" * ");
//                else
//                    System.out.print("   ");
//            }
//            System.out.println();
//        }


        /*
        User enters N(size of triangle side). Draw figure below.
        input: 5
        output:
        * * * * *
          * * * *
            * * *
              * *
                *
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(j >= i)
//                    System.out.print(" * ");
//                else
//                    System.out.print("   ");
//            }
//            System.out.println();
//        }

        /*
        User enters N(size of triangle side). Draw figure below.
        input: 5
        output:
        * * * * *
        * * * *
        * * *
        * *
        *
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if(i+j <= n+1)
//                    System.out.print(" * ");
//                else
//                    System.out.print("   ");
//            }
//            System.out.println();
//        }

        /*
        input: 3 (height)
        output:
            *
          * * *
        * * * * *
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//        int stars = 1, spaces = n-1;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=spaces; j++){
//                System.out.print("   ");
//            }
//            for(int k=1; k<=stars; k++){
//                System.out.print(" * ");
//            }
//            spaces--;
//            stars = stars + 2;
//
//            System.out.println();
//        }

         /*
        input: 3 (height)
        output:
        * * * * *
          * * *
            *
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//        int stars = 2*n-1, spaces = 0;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=spaces; j++){
//                System.out.print("   ");
//            }
//            for(int k=1; k<=stars; k++){
//                System.out.print(" * ");
//            }
//            spaces++;
//            stars = stars - 2;
//            System.out.println();
//        }

    }
}







