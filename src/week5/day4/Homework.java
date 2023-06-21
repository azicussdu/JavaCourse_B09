package week5.day4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter an expression: ");
        String exp = in.next();

        int operatorIndex = exp.indexOf('+');
        if(operatorIndex == -1){ //if still operator is unknown
            operatorIndex = exp.indexOf('-');
        }

        int num1, num2;
        int result = 0;
        if(operatorIndex != -1){
            num1 = Integer.parseInt(exp.substring(0, operatorIndex));
            num2 = Integer.parseInt(exp.substring(operatorIndex+1));

            switch(exp.charAt(operatorIndex)){
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
            }

            System.out.println("result is: " + result);
        }
    }
}
