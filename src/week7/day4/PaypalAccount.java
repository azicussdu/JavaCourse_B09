package week7.day4;

import java.util.Random;

public class PaypalAccount {
    String email;
    String password;
    double moneyBalance;
    String cardNumber;

    public PaypalAccount(String email, String password, String cardNumber, double moneyBalance){
        this.email = email;
        this.password = password;
        this.cardNumber = cardNumber;
        this.moneyBalance = moneyBalance;
    }

    public PaypalAccount(String email, String password, String cardNumber){
        this.email = email;
        this.password = password;
        this.cardNumber = cardNumber;
        this.moneyBalance = 0;
    }

    public PaypalAccount(String email, String cardNumber){
        this.email = email;

        Random random = new Random();
        int number = random.nextInt(100000, 1000000);
        this.password = String.valueOf(number);

        this.cardNumber = cardNumber;
        this.moneyBalance = 0;
    }

    public void sendFirstEmail(){
        System.out.println("sending email with message: ");
        System.out.println("your email: " + email);
        System.out.println("your card number: " + cardNumber);
        System.out.println("your password: " + password);
        System.out.println("you can change it in one day");
    }


}
