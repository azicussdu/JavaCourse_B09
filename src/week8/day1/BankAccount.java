package week8.day1;

public class BankAccount {
    String clientName;
    double moneyBalance = 0;
    static double bankBalance = 1000000;

    public BankAccount(String clientName, double moneyBalance){
        this.clientName = clientName;
        this.moneyBalance = moneyBalance;
    }

    public void deposit(double money){
        moneyBalance = moneyBalance + money;
        bankBalance = bankBalance + money;
        System.out.println("now your balance is " + moneyBalance);
    }

    public void withdraw(double money){

        if(money <= moneyBalance){
            moneyBalance = moneyBalance - money;
            bankBalance = bankBalance - money;
            System.out.println("now your balance: " + moneyBalance);
        }
        else{
            System.out.println("Not enough money balance");
        }
    }
}
