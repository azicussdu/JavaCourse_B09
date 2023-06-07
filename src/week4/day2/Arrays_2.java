package week4.day2;

import java.util.Random;
import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {

        // Hometask 1: User enters N, then N numbers
        //Print "Yes" if sum of evens bigger than odds
        //Print "No" if sum of odds bigger than evens
        //Print "Equal" if sums are equal

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter value for N: ");
//        int n = in.nextInt();
//        int sumEvens = 0, sumOdds = 0;
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            System.out.print("enter array value: ");
//            arr[i] = in.nextInt();
//        }
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] % 2 == 0)
//                sumEvens = sumEvens + arr[i];
//            else
//                sumOdds = sumOdds + arr[i];
//        }
//
//        if(sumOdds > sumEvens)
//            System.out.println("No");
//        else
//            if(sumEvens > sumOdds)
//                System.out.println("Yes");
//            else
//                System.out.println("Equal");

        /*
        Hometask 3: Find max in array of positive integers.
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter value for N: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.print("enter " + n + " values: ");
//        for(int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        int max = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        System.out.println("max is: " + max);


//        Random random = new Random();
//        int num;
//
//        for(int i=1; i<=20; i++){
//            num = random.nextInt(-10, 11); //it 0-100
//            System.out.print(num + " ");
//        }

        /*
        Task: Input N, fill array with size N - with random integers.
         */

//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter value N: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextInt(1, 20);
//            System.out.print(arr[i] + " ");
//        }
//
//        //show values that are stored under odd indexes
//        System.out.println("\nprinting values under odd indexes: ");
//        for(int i=0; i<arr.length; i++){
//            if(i % 2 == 1){
//                System.out.print(arr[i] + " ");
//            }
//        }

        /*
        Hometask 2: sums of left and right.
         */
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter the N: ");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextInt(1, 20);
//            System.out.print(arr[i] + " ");
//        }
//
//        int sumLeft = 0, sumRight = 0, midIndex = n / 2;
//
//        for(int i=0; i < midIndex; i++){
//            sumLeft = sumLeft + arr[i];
//        }
//
//        if(n % 2 == 1) { //if size of array is odd number
//            midIndex = midIndex + 1;
//        }
//
//        for(int i=midIndex; i<arr.length; i++){
//            sumRight = sumRight + arr[i];
//        }
//
//        if(sumRight > sumLeft)
//            System.out.println("Right side");
//        else
//            if(sumLeft > sumRight)
//                System.out.println("Left side");
//            else
//                System.out.println("Equal");

        /*
        User enter N, fill array with random numbers.
        User enter X. We should find if the number X exists in our array
        If yes print the FIRST index of X (the very first appearance)
        If no print "Not found"

        input: 7
        12 15 7 4 9 19 1
        enter X: 4

        output: index is 3
         */

//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter the N: ");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextInt(1, 20);
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.print("\nenter the value of X: ");
//        int x = in.nextInt();
//
//        boolean found = false;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == x){
//                System.out.println("index is: " + i);
//                found = true;
//                break;
//            }
//        }
//
//        if(found == false){
//            System.out.println("Not found");
//        }


        /*
        Task: User enters N, fill random in a range of -10 to 10.
        Count the amount positives and negatives.
        Print "Positive" if amount of positives greater than amount of negatives
        Print "Negative" if amount of negatives greater than amount of positives
        Print "Equal" if the amounts are equal
         */

//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter the N: ");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = random.nextInt(-10, 11); //-10, 10
//            System.out.print(arr[i] + " ");
//        }
//
//        int countPos = 0, countNeg = 0;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] < 0)
//                countNeg++;
//            else
//                if(arr[i] > 0)
//                    countPos++;
//        }
//
//        if(countPos > countNeg)
//            System.out.println("positives");
//        else
//            if(countPos < countNeg)
//                System.out.println("negatives");
//            else
//                System.out.println("Equal");


        /*
        User inputs N, user input N - numbers. !!! that there should be 2 zero's
        Print the sum of numbers between these 2 zero's

        input: 7
        2 4 0 2 1 0 8

        output: 3
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("enter the N: ");
//        int n = in.nextInt();
//        int[] arr = new int[n];
//
//        System.out.print("enter values: ");
//        for(int i=0; i<arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        int ind1, ind2;
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] == 0){
//                ind1 = i;
//                break;
//            }
//        }

        //TODO finish it as a hometask





    }
}
