package week8.day1;

public class TestStaticProperties {
    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount("Fred", 1000);
        BankAccount ba2 = new BankAccount("Mike", 2000);
        BankAccount ba3 = new BankAccount("Madonna", 3000);

        System.out.println("before Bank Balance = " + BankAccount.bankBalance);
        ba1.deposit(5000); //money balance 6000
        ba2.deposit(6000); //money balance 8000
        ba3.deposit(7000); //money balance 10000

        //bankBalance is static, means it doesn't belong to objects
        //so when ba1, ba2 or ba3 are depositing or withdrawing money -
        //then bankBalance is changed (as it is a common for all objects)
        System.out.println("after Bank Balance = " + BankAccount.bankBalance);


    }
}
