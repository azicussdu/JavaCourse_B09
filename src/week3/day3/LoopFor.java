package week3.day3;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {

//        for(int count = 1; count <= 20; count++){
//            System.out.print(count + " ");
//        }

        //count = count + 1   ===  count+=1  ===  count++
        //count = count + 2   ===  count+=2
        //count = count - 2   ===  count-=2
        //count = count * 2   ===  count*=2
//        for(int count = 1; count <= 100; count*=2){
//            System.out.print(count + " ");
//        }

        /*
        Task: Users enters a Num.
        Print the sum of numbers from 1 to Num.
         */
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        int sum = 0;
//
//        for(int count=1; count<=num; count++){
//            sum = sum + count;
//        }
//
//        System.out.println("sum is: " + sum);

        /*
        Task: Users enters a Num.
        Print the sum of odd numbers from 1 to Num.
        input: 10
        output: 25  //1+3+5+7+9
         */
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        int sum = 0;
//
//        for(int count=1; count<=num; count++){
//            if(count % 2 == 1){
//                sum = sum + count;
//            }
//        }
//
//        System.out.println("sum is: " + sum);


        /*
        Second way of adding odd numbers
         */
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int num = in.nextInt();
//        int sum = 0;
//
//        for(int count=1; count<=num; count+=2){
//            sum = sum + count;
//        }
//
//        System.out.println("sum is: " + sum);

        /*
        Task: User enters a Num.
        Find and print the amount of numbers divisible by 3
        between 1 and Num(included).
        input: 17
        output: 5    //3, 6, 9, 12, 15 -> so 5 numbers
         */

//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter you number: ");
//        int num = in.nextInt();
//        int count = 0;
//
//        for(int i=1; i<=num; i++){
//            if(i % 3 == 0){
//                count++;
//            }
//        }
//
//        System.out.println("the amount nums div by 3 is: " + count);


        /*
        Task: User enters 5 numbers. Print the sum of numbers.
        input: 4 6 1 2 7
        output: 20
         */
//        Scanner in = new Scanner(System.in);
//        int sum = 0;
//        int num;
//
//        for(int i=1; i<=5; i++){
//            System.out.print("enter number: ");
//            num = in.nextInt();
//            sum = sum + num;
//        }
//
//        System.out.println("sum is: " + sum);

        /*
        Task: User enters 5 number. Find amount of odd and even numbers,
        and print it.
        input: 2 5 7 4 1
        output:
            odds: 3
            evens: 2
         */

//        Scanner in = new Scanner(System.in);
//
//        int countOdds = 0, countEvens = 0;
//        int num;
//
//        for(int i=1; i<=5; i++){
//            num = in.nextInt();
//
//            if(num % 2 == 0)
//                countEvens++;
//            else
//                countOdds++;
//        }
//
//        System.out.println("odds: " + countOdds);
//        System.out.println("evens: " + countEvens);

        /*
        Task: User inputs N first. Then he enters N amount of numbers.
        Print the sum of numbers.
        input:
        5
        2 4 6 8 9
        output:
        29
         */

//        Scanner in = new Scanner(System.in);
//        int amount, num, sum = 0;
//
//        System.out.print("enter the amount of numbers you want to enter: ");
//        amount = in.nextInt();
//
//        for(int i=1; i<=amount; i++){
//            num = in.nextInt();
//            sum = sum + num;
//        }
//
//        System.out.println("sum is: " + sum);


        /*
        Task: User inputs N first. Then he enters N amount of positive numbers.
        Find and print the maximum number from input.
        input:
        5
        2 4 12 8 9
        output:
        12
         */

//        Scanner in = new Scanner(System.in);
//        int amount, num, maxNum = 0;
//
//        System.out.print("enter the amount of numbers you want to enter: ");
//        amount = in.nextInt();
//
//        for(int i=1; i<=amount; i++){
//            num = in.nextInt();
//            if(num > maxNum){
//                maxNum = num;
//            }
//        }
//
//        System.out.println("max is: " + maxNum);

    }
}





