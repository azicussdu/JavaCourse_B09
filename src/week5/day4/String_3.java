package week5.day4;

import java.util.Scanner;

public class String_3 {
    public static void main(String[] args) {

//        String s = "Hello world guys";
//        String s2 = s.substring(6);
//        String s3 = s.substring(6, 11);
//
//        System.out.println("s2: " + s2);
//        System.out.println("s3: " + s3);

//        String s = "Hello";
//        for(int i=1; i<=s.length(); i++){
//            System.out.println(s.substring(0, i));
//        }

        /*
        User enters a sentence with 3 words inside.
        Print only first and third.
        input: java the best
        output:
        first = java
        third = best
         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter 3 word sentence: ");
//        String sent = in.nextLine();
//
//        String firstWord = sent.substring(0, sent.indexOf(' '));
//        System.out.println("first: " + firstWord);
//
//        String thirdWord = sent.substring(sent.lastIndexOf(' ')+1);
//        System.out.println("third: " + thirdWord);

        /*
        Task: user enters a sentence, then enters a word.
        Print "Yes" if the word is exists in sentence, otherwise "No"

        input:
        My name is Mike Tyson
        tyson

        output: Yes
         */
//        Scanner in = new Scanner(System.in);
//
//        String sent = in.nextLine();
//        String word = in.next();
//
//        sent = sent.toLowerCase();
//        word = word.toLowerCase();
//
//        int index = sent.indexOf(word);
//
//        if(index != -1)
//            System.out.println("Yes");
//        else
//            System.out.println("No");

//        String sent = "c++ is my favorite PL, c++ is the best!";
//
////        sent = sent.replace(' ', '_');
//        sent = sent.replace("c++", "java");
//        System.out.println(sent);


        //find if string odd number, or even
//        String s = "123";
//        int x = Integer.parseInt(s);
//        System.out.println(x+x);



        /*
        user enters a time in format: mm:ss
        validate the time.

        input: 12:59
        output: Valid time

        input: 32:60
        output: Not valid time
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter time in format mm:ss ");
//        String time = in.next();
//
//        String minute = time.substring(0, time.indexOf(':'));
//        String second = time.substring(time.indexOf(':')+1);
//
//        int min = Integer.parseInt(minute);
//        int sec = Integer.parseInt(second);
//
//        if((min >= 0 && min <= 59) && (sec >= 0 && sec <= 59))
//            System.out.println("Valid time");
//        else
//            System.out.println("Not valid time");

        /*
        user inputs a math expression. find the result.

        input: "1+343"
        output: 344
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter a math expression: ");
//
//        String exp = in.next();
//
//        String firstNum = exp.substring(0, exp.indexOf('+'));
//        String secondNum = exp.substring(exp.indexOf('+')+1);
//
//        int num1 = Integer.parseInt(firstNum);
//        int num2 = Integer.parseInt(secondNum);
//
//        System.out.println(num1 + num2);

        /*
        user enters a date in format: "dd-mm-yyyy"
        validate the date so:
        - day (1-31)
        - month (1-12)
        - year (the last should 2023)
         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter a date: ");
//
//        String date = in.next();
//
//        String day = date.substring(0, date.indexOf('-'));
//        String month = date.substring(date.indexOf('-')+1, date.lastIndexOf('-'));
//        String year = date.substring(date.lastIndexOf('-')+1);
//
//        int d = Integer.parseInt(day);
//        int m = Integer.parseInt(month);
//        int y = Integer.parseInt(year);
//
//        if((d >= 1 && d <= 31) && (m >= 1 && m <= 12) && (y <= 2023))
//            System.out.println("Valid date");
//        else
//            System.out.println("Invalid date");
    }
}







