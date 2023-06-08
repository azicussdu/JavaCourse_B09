package week4.day3;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

//        for(int i=1; i<=3; i++){                        //outer loop
//            for(int j=1; j<=4; j++){                    //inner loop
//                System.out.print("hello world / ");
//            }
//            System.out.println();
//        }

        /*
        1 1 1 1
        2 2 2 2
        3 3 3 3
         */

//        for(int i=1; i<=3; i++){
//            for(int j=1; j<=4; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        /*
        1 2 3 4
        1 2 3 4
        1 2 3 4
         */

//        for(int i=1; i<=3; i++){
//            for(int j=1; j<=4; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        /*
        input N: 5

        output:
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        /*
        input N: 4

        output:
        1
        1 2
        1 2 3
        1 2 3 4
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(j > i)
//                    break;
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }


        /*
        input:
        enter N: 4

        output:
        ****
        ****
        ****
        ****

         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
        input:
        enter N: 5

        output:
        *****
        *   *
        *   *
        *   *
        *****

         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i == 1 || i == n || j == 1 || j == n)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }


        /*
        input:
        enter N: 5

        output:
        * * *
         * *
        * * *
         * *
        * * *
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++) {
//                if((i%2==1 && j%2==1) || (i%2==0 && j%2==0))
//                    System.out.print("*");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }

        /*
        input:
        enter N: 5  (input must an ODD number)

        output:
        --*--
        --*--
        *****
        --*--
        --*--
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter ODD N: ");
//        int n = in.nextInt();
//
//        for(int i=1; i<=n; i++) {
//            for (int j=1; j<=n; j++) {
//                if(i == n/2+1 || j == n/2+1)
//                    System.out.print("*");
//                else
//                    System.out.print("-");
//            }
//            System.out.println();
//        }

    }
}







