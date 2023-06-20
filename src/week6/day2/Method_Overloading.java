package week6.day2;

import java.util.Random;

public class Method_Overloading {

    //Method overloading example
    public static double findSum(double a, double b){
        double sum = a + b;
        return sum;
    }
    public static int findSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int findSum(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }

    public static void fillArray(int[] myarr, int f, int t){
        Random random = new Random();
        for(int i=0; i<myarr.length; i++){
            myarr[i] = random.nextInt(f, t);
        }
    }

    public static void fillArray(int[] myarr, int t){
        Random random = new Random();
        for(int i=0; i<myarr.length; i++){
            myarr[i] = random.nextInt(1, t);
        }
    }

    public static void fillArray(int[] myarr){
        Random random = new Random();
        for(int i=0; i<myarr.length; i++){
            myarr[i] = random.nextInt(1, 101);
        }
    }

    public static void printArray(int[] myarr, boolean vertical){
        System.out.println("---------- printing values -----------");
        for(int i=0; i<myarr.length; i++){
            if(vertical == true)
                System.out.println(myarr[i] + " ");
            else
                System.out.print(myarr[i] + " ");
        }
        System.out.println("\n--------------------------------------");
    }


    public static void main(String[] args) {

        int[] arr = new int[10];

//        fillArray(arr, 10, 21); // values are from 10 - 20
//        fillArray(arr, 21);       // values are from 1 - 20
//        fillArray(arr);            // values are 1 - 100
//        printArray(arr, true);

        // -----------------------------------------------------------

//        int result1 = findSum(3, 4); //calling findSum(int a, int b)
//        System.out.println("result1 = " + result1);
//
//        double result2 = findSum(3.3, 4.3); //calling findSum(double a, double b)
//        System.out.println("result2 = " + result2);
//
//        int result3 = findSum(3, 4, 5); //calling findSum(int a, int b, int c)
//        System.out.println("result3 = " + result3);
    }
}
