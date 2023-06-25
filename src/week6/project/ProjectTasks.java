package week6.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProjectTasks {

    public static double findCircleArea(int radius){
        double area = 3.14 * radius * radius;
        return area;
    }

    public static int findSumOfDigits(int a){
        int sum = 0;
        while(a > 0){
            sum = sum + (a % 10);
            a = a / 10;
        }
        return sum;
    }

    public static boolean isAlpha(char c){
        if((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
            return true;
        else
            return false;
    }

    public static boolean isAlpha(String str){
        boolean allCharsAreLetters = true; //assume that all are letters
        for(int i=0; i<str.length(); i++){
            //if we find at least non-letter char then we change result to false
            if(str.charAt(i) < 65 || (str.charAt(i) > 90 && str.charAt(i) < 97) || str.charAt(i) > 122){
                allCharsAreLetters = false;
                break;
            }
        }
        return allCharsAreLetters;
    }

    public static int countNegatives(int[] myarr){
        int count = 0;
        for(int i=0; i<myarr.length; i++){
            if(myarr[i] < 0){
                count++;
            }
        }
        return count;
    }

    public static int findValue(int[] myarr, int value){
        int index = -1;
        for(int i=0; i<myarr.length; i++){
            if(myarr[i] == value){
                index = i;
                break;
            }
        }

        return index;
    }

    public static void fillArray(int[][] myarr, boolean withRandoms){
        Random random = new Random();
        int sequenceNum = 1;

        for(int i=0; i<myarr.length; i++){
            for(int j=0; j<myarr[0].length; j++){
                if(withRandoms == true)
                    myarr[i][j] = random.nextInt(1, 101);
                else {
                    myarr[i][j] = sequenceNum;
                    sequenceNum++;
                }
            }
        }
    }

    public static void main(String[] args) {

        // #1.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter radius: ");
//        int rad = in.nextInt();
//
//        double result = findCircleArea(rad);
//        System.out.println("result: " + result);


        // #2.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter a positive number: ");
//        int num = in.nextInt();
//
//        int result = findSumOfDigits(num);
//        System.out.println("result: " + result);


        // #3.
//        boolean result = isAlpha('A');
//        System.out.println("result is: " + result);
//
//        result = isAlpha('a');
//        System.out.println("result is: " + result);
//
//        result = isAlpha('@');
//        System.out.println("result is: " + result);


        // #4.
//        boolean result = isAlpha("Hello");
//        System.out.println("result is: " + result);
//
//        result = isAlpha("Hello5!");
//        System.out.println("result is: " + result);


        // #5.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter array size: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = random.nextInt(-5, 11);
//            System.out.print(arr[i] + " ");
//        }
//
//        int result = countNegatives(arr);
//        System.out.println("\nresult: " + result);


        // #6.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.print("enter array size: ");
//        int n = in.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = random.nextInt(1, 101);
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.print("\nEnter value to search: ");
//        int value = in.nextInt();
//
//        int result = findValue(arr, value);
//        System.out.println("result: " + result);


        // #7.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter N and M: ");
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int[][] arr = new int[n][m];
//        fillArray(arr, false);
//
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        // #8.
//        ArrayList<Integer> list = new ArrayList<>(List.of(1, 4, 5, 8, 12, 13, 14));
//        System.out.println("Before: " + list);
//        for(int i=0; i<list.size(); i++){
//            if(list.get(i) % 2 == 0){
//                list.set(i, list.get(i)+1);
//            }
//        }
//        System.out.println("After:  " + list);

        // #9.
//        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 6, 7));
//        System.out.println("Before: " + list);
//        for(int i=0; i<list.size()-1; i++){
//            if(list.get(i+1) - list.get(i) == 2){
//                list.add(i+1, list.get(i)+1);
//                break;
//            }
//        }
//        System.out.println("After:  " + list);
    }
}
