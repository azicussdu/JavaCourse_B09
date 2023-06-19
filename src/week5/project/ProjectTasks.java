package week5.project;

import java.util.Random;
import java.util.Scanner;

public class ProjectTasks {
    public static void main(String[] args) {

        // #1.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//        System.out.print("enter N and M: ");
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        int[][] arr = new int[n][m];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<m; j++){
//                arr[i][j] = random.nextInt(-2, 21);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Indexes of all negatives: ");
//
//        boolean hasNegative = false;
//        for(int i=0; i<n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(arr[i][j] < 0){
//                    System.out.println("i="+i+", j="+j);
//                    hasNegative = true;
//                }
//            }
//        }
//
//        if(hasNegative == false)
//            System.out.println("Not found");


        // #2.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//        System.out.print("enter N: ");
//        int n = in.nextInt();
//
//        int[][] arr = new int[n][n];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                arr[i][j] = random.nextInt(1, 10);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int sum = 0;
//
//        for(int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(i==0 || j==0 || i==n-1 || j==n-1){
//                    sum = sum + arr[i][j];
//                }
//            }
//        }
//
//        System.out.println("sum is: " + sum);


        // #3.
//        Scanner in = new Scanner(System.in);
//        Random random = new Random();
//        System.out.print("enter odd N: ");
//        int n = in.nextInt();
//
//        int[][] arr = new int[n][n];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                arr[i][j] = random.nextInt(1, 10);
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int sumOfMiddleRow = 0;
//        int sumOfMiddleColumn = 0;
//
//        for(int i=0; i<n; i++) {
//            for (int j = 0; j < n; j++) {
//                if(i == n/2){
//                    sumOfMiddleRow = sumOfMiddleRow + arr[i][j];
//                }
//                if(j == n/2){
//                    sumOfMiddleColumn = sumOfMiddleColumn + arr[i][j];
//                }
//            }
//        }
//
//        System.out.println("sum of middle row is: " + sumOfMiddleRow);
//        System.out.println("sum of middle column is: " + sumOfMiddleColumn);


        // #4.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter your name: ");
//        String name = in.next();
//
//        /*
//        assume that it is valid in the beginning and
//        try to find the reasons why it can be invalid
//         */
//        boolean nameIsValid = true;
//
//        if(name.length() < 2 || (name.charAt(0) < 65 || name.charAt(0) > 90)){
//            nameIsValid = false;
//        }
//
//        /*
//        starting from index=1, because first letter I already checked in IF statement
//         */
//        for(int i=1; i<name.length(); i++){
//            if(name.charAt(i) < 97 || name.charAt(i) > 122){
//                nameIsValid = false;
//                break;
//            }
//        }
//
//        if(nameIsValid)
//            System.out.println("Valid name");
//        else
//            System.out.println("Invalid name");


        // #5.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter your sentences: ");
//        String s = in.nextLine();
//
//        s = s.trim(); //to be sure that no spaces in the beginning or end of sentence
//        int indexOfFirstSpace = s.indexOf(' ');
//        int indexOfSecondSpace = s.lastIndexOf(' ');
//
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(indexOfFirstSpace-1));
//        System.out.println(s.charAt(indexOfFirstSpace+1));
//        System.out.println(s.charAt(indexOfSecondSpace-1));
//        System.out.println(s.charAt(indexOfSecondSpace+1));
//        System.out.println(s.charAt(s.length()-1));


        // #6.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter your sentences: ");
//        String s = in.nextLine();
//
//        s = s.trim(); //to be sure that no spaces in the beginning or end of sentence
//        int indexOfFirstSpace = s.indexOf(' ');
//        int indexOfSecondSpace = s.lastIndexOf(' ');
//
//        String secondWord = s.substring(indexOfFirstSpace+1, indexOfSecondSpace);
//        System.out.println("second word is: " + secondWord);


        // #7.
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter a date: ");
//        String date = in.next();
//
//        int day, month, year;
//
//        if(date.indexOf('-') == 2)
//            day = Integer.parseInt(date.substring(0, 2));
//        else
//            day = Integer.parseInt(date.substring(8, 10));
//
//        if(date.indexOf('-') == 2)
//            month = Integer.parseInt(date.substring(3, 5));
//        else
//            month = Integer.parseInt(date.substring(5, 7));
//
//        if(date.indexOf('-') == 2)
//            year = Integer.parseInt(date.substring(6, 10));
//        else
//            year = Integer.parseInt(date.substring(0, 4));
//
//        if((day >= 1 && day <= 31) && (month >= 1 && month <= 12) && year <= 2023){
//            System.out.println("Valid date");
//        }
//        else {
//            System.out.println("Invalid date");
//        }


        // #8.
        Scanner in = new Scanner(System.in);
        System.out.print("enter an expression: ");
        String exp = in.next();

        int operatorIndex = exp.indexOf('+');
        if(operatorIndex == -1){ //if still operator is unknown
            operatorIndex = exp.indexOf('-');
        }
        if(operatorIndex == -1){ //if still operator is unknown
            operatorIndex = exp.indexOf('*');
        }
        if(operatorIndex == -1){ //if still operator is unknown
            operatorIndex = exp.indexOf('/');
        }

        int num1, num2;
        double result = 0;
        if(operatorIndex != -1){
            num1 = Integer.parseInt(exp.substring(0, operatorIndex));
            num2 = Integer.parseInt(exp.substring(operatorIndex+1));

            switch(exp.charAt(operatorIndex)){
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = (double)num1 / num2; break;
            }

            System.out.println("result is: " + result);
        }

    }
}
