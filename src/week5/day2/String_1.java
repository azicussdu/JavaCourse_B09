package week5.day2;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {

//        char s = 'd'; //user entered a character
//        System.out.println("value of s: " + s);
//        System.out.println("ascii code is: " + (int)s);

        // so this is 1 way, but not the shortest one
//        if(s == 'a' || s == 'b' || s == 'c' || .... || s == 'z')
//            System.out.println("it is a lowercase letter");
//        else
//            System.out.println("It is not lowercase letter");


//        char s = 'C'; // ascii code of 'C' = 67
//
//        if( s >= 97 && s <= 122 )
//            System.out.println("lowercase letter");
//        else
//            if(s >= 65 && s <= 90)
//                System.out.println("uppercase letter");
//            else
//                if(s >= 48 && s <= 57)
//                    System.out.println("just a digit");
//                else
//                    System.out.println("Some other symbol");

//        char s1 = 'A';
//        char s2 = 'a';
//
//        if(s1 > s2){
//            System.out.println("ascii of 'A' is bigger than ascii of 'a'");
//        }
//        else {
//            System.out.println("ascii of 'a' is bigger than ascii of 'A'");
//        }


//        String s1 = "Hello world";
//        System.out.println("value of s1: " + s1);
//
//        System.out.println("the length of s1 is: " + s1.length() );
//        System.out.println( s1.charAt(0) );  //similar to s1[0]
//        System.out.println( s1.charAt(10) ); //similar to s1[10]


//        String s = "TechnoStudy";
//
//        for(int i=0; i<s.length(); i++){
//            System.out.println(s.charAt(i));
//        }


//        Scanner in = new Scanner(System.in);
//        System.out.print("enter one word: ");
//
//        String s = in.next(); //read a word from console
//        System.out.println("you entered: " + s);


        /*
        Task: user enters a word, count the amount of lowercase letters
        input: HelLo
        output: 3
         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("enter one word: ");
//
//        String s = in.next();
//        int countLowercases = 0;
//
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
//                countLowercases++;
//        }
//
//        System.out.println("there are " + countLowercases + " lowercase letters");

        /*
        user enters a word, find if it has at least one digit symbol.
        print "Yes" if it has, and "No" otherwise.
        input: Hello5
        output: Yes
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter one word: ");
//
//        String s = in.next();
//        boolean hasDigits = false;
//
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
//                hasDigits = true;
//                break;
//            }
//        }
//
//        if(hasDigits == true)
//            System.out.println("Yes");
//        else
//            System.out.println("No");


        /*
        user enters a word,
        find if the word consists of ONLY uppercase letters.
        print "Yes" if yes, and "No" otherwise.
        input: HE5LLO
        output: No
        --------------
        input: HELLO
        output: Yes
         */

//        Scanner in = new Scanner(System.in);
//        System.out.print("enter one word: ");
//
//        String s = in.next();
//        boolean areAllUppercase = true;
//
//        for(int i=0; i<s.length(); i++) {
//            if (s.charAt(i) < 65 || s.charAt(i) > 90) {  // if char is NOT uppercase (65-90)
//                areAllUppercase = false;
//                break;
//            }
//        }
//
//        if(areAllUppercase)  // the same as: if(areAllUppercase == true)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
    }
}
