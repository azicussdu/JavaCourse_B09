package week2.project;

import java.util.Scanner;

public class ProjectTasks {
    public static void main(String[] args) {
        //#1
//        Scanner in = new Scanner(System.in);
//        int gr1, gr2, gr3, gr4, gr5;
//
//        System.out.print("enter 1st grade: ");
//        gr1 = in.nextInt();
//        System.out.print("enter 2nd grade: ");
//        gr2 = in.nextInt();
//        System.out.print("enter 3rd grade: ");
//        gr3 = in.nextInt();
//        System.out.print("enter 4th grade: ");
//        gr4 = in.nextInt();
//        System.out.print("enter 5th grade: ");
//        gr5 = in.nextInt();
//
//        double avg = (gr1+gr2+gr3+gr4+gr5) / 5.0;
//        boolean isPassed = (avg >= 70.5);
//
//        System.out.println("Condition \"student passed exams\" is: " + isPassed);

        //#2
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter amount of money you have now: ");
//        int moneyAmt = in.nextInt();
//        System.out.print("Enter price for 1 kilo of apples: ");
//        int kiloPrice = in.nextInt();
//
//        int canBuyAmt = moneyAmt / kiloPrice;
//        int change = moneyAmt % kiloPrice;
//
//        System.out.println("You can buy "+ canBuyAmt +" kilos of apple");
//        System.out.println("Change after purchase: " + change);


        //#3
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter cone radius: ");
//        double radius = in.nextDouble();
//        System.out.print("Enter height of a cone: ");
//        double height = in.nextDouble();
//
//        double volume = 1.0 / 3 * 3.14 * radius * radius * height;
//        System.out.println("Volume of a cone is: " + volume);


        //#4
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter number of students who passed exams: ");
//        int passed = in.nextInt();
//        System.out.print("Enter number of students who failed exams: ");
//        int failed = in.nextInt();
//
//        double passedInPercentage = passed / (double)(passed + failed) * 100;
//        double failedInPercentage = failed / (double)(passed + failed) * 100;
//
//        System.out.println("passed " + passedInPercentage + " %");
//        System.out.println("failed " + failedInPercentage + " %");


        //#5
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter 1st number: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter 2nd number: ");
//        int num2 = in.nextInt();
//        System.out.print("Enter 3rd number: ");
//        int num3 = in.nextInt();
//
//        boolean isSecondMin = (num2 <= num1 && num2 <= num3);
//        System.out.println("Condition that second number is the minimum one is: " + isSecondMin);


        //#6
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter 1st number: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter 2nd number: ");
//        int num2 = in.nextInt();
//
//        //this is the short way. It means if their remainders(after division by 2) are equal
//        boolean isBothEvenOrOdd = (num1 % 2 == num2 % 2);
//        //also can do: boolean isBothEvenOrOdd = (num1%2 == 0 && num2%2 == 0 || num1%2 == 1 && num2%2 == 1);
//
//        System.out.println("Condition both of them even or odd: " + isBothEvenOrOdd);


        //#7
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter four-digit number: ");
//        int num = in.nextInt();
//
//        int d4 = num % 10;
//        int d3 = num % 100 / 10;
//        int d2 = num / 100 % 10;
//        int d1 = num / 1000;
//
//        boolean isDigitsSumsEqual = (d1 + d2 == d3 + d4);
//        System.out.println("Condition is: " + isDigitsSumsEqual);


        //#8
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter four-digit number: ");
//        int num = in.nextInt();
//
//        int d4 = num % 10;
//        int d3 = num % 100 / 10;
//        int d2 = num / 100 % 10;
//        int d1 = num / 1000;
//
//        int result = d4*1000 + d3*100 + d2*10 + d1;
//        System.out.println("The vice versa number is: " + result);
    }
}
