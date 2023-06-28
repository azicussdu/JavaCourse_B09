package week7.day2;

import java.util.Scanner;

public class BankAccount {
    String clientName;
    double moneyBalance = 0;
    String cardNumber;
    String pinCode;

    public boolean checkPinCode(){
        Scanner in = new Scanner(System.in);

        for(int i=1; i<=3; i++){
            System.out.print("enter pin code: ");
            String pc = in.next();

            if(pinCode.equals(pc))
                return true;
            else{
                if(i == 3){
                    System.out.println("sorry, call you bank");
                    return false;
                }
                else
                    System.out.println("pin code is not correct, try 1 more time");
            }
        }

        return false;
    }

    public void deposit(double money){
        boolean isPinCodeCorrect = checkPinCode();

        if(isPinCodeCorrect){
            moneyBalance = moneyBalance + money;
            System.out.println("now your balance is " + moneyBalance);
        }
    }

    public void withdraw(double money){
        boolean isPinCodeCorrect = checkPinCode();

        if(isPinCodeCorrect){
            if(money <= moneyBalance){
                moneyBalance = moneyBalance - money;
                System.out.println("now your balance: " + moneyBalance);
            }
            else{
                System.out.println("Not enough money balance");
            }
        }
    }
}
